/**
 * 腾讯云 COS 接口
 * Version:  1.0.0
 * author: xiaogezi
 * 
 * option: {
 *  bucket: '', // 腾讯云对象存储(COS)中 bucket 名称
 *  appid: '',  // 腾讯云对象存储(COS)中 API APPID
 *  region: '', // Bucket 所在区域（华东 sh, 华南 gz 等）
 *  folder: '', // 上传到 Bucket 所在目录
 *  CSRF: '',   // 请求 Token
 *  uploadSuccess: function(){}  // 回调
 *  targets: '.js-upload' // 触发选择文件的 HTML 节点选择器
 * }
 */
function qcloud(option) {
    this.cos = null;
    this.bucket = option.bucket;
    this.appid = option.appid;
    this.region = option.region || 'gz';
    this.folder = option.folder || '';
    this.CSRF = option.CSRF;
    this.form = null;
    this.fileInput = null;
    this.uploadSuccess = option.uploadSuccess;
    this.load = option.load;
    this.targets = option.targets || '.js-upload';
    this._folderContext = null;
    this.preload();
};
qcloud.prototype = {
    constructor: qcloud,
    _uploadSuccess: function (res) {
        var $file = this.$file;
        if (res.code == 0) {
            var url = res.data.access_url;
            var valueFor = $file.data('valueFor'),
                renderFor = $file.data('renderFor');

            var $el = $(valueFor);
            if ($el.is('input')) {
                $el.val(url);
            } else {
                $el.attr('data-value', url);
            }
            var $pic = $(renderFor);
            if ($pic.is('img')) {
                $pic.attr('src', url);
            } else {
                $pic.css('backgroundImage', 'url(' + url + ')');
            }

            this.uploadSuccess && this.uploadSuccess.call(this, res, renderFor, valueFor);

            $file.removeAttr('data-value-for');
            $file.removeAttr('data-render-for');
        }
    },
    /**
     * 生成签名
     * folder {String} Bucket 所在目录
     * more {Boolean} 签名是否一次性
     * callback {Function} 回调
     */
    sign: function (folder, more, callback) {
        // var data = { __CSRF__: this.CSRF };
        // if (folder && more) {
        //     $.extend(data, data, {
        //         folder: folder,
        //         more: more
        //     })
        // }
        // $.ajax({
        //     url: '/admin/low/qcloudcossign',
        //     type: 'POST',
        //     data: data,
        // }).done(function (res) {
        //     if (res.errno == 0) {
        //         callback && callback(res.data.sign);
        //     }
        // });
    },
    formatFolder: function(folder){
        if (folder && folder.slice(-1) != '/') {  // 文件夹后需添加 / 
            folder += '/';
        }
        return folder;
    },
    /**
     * COS 上传
     */
    upload: function (e, folder) {
        var file = e.target.files[0];
        folder = this.formatFolder(folder);
        // 分片上传过程可能会有 op=upload_slice_list 的 POST 请求返回 404，不会影响上传：https://github.com/tencentyun/cos-js-sdk-v4/issues/16
        this.cos.uploadFile(this._uploadSuccess.bind(this), this.errorCallBack, this.progressCallBack, this.bucket, folder + file.name, file, 0, this.taskReady);//insertOnly==0 表示允许覆盖文件 1表示不允许
    },
    events: function (selector) {
        var me = this;
        var $file = this.$file;
        //上传文件,适合小于20M的文件上传
        $(selector).on('click', function (e) {
            var eo = $(e.target),
                valueFor = eo.data('valueFor'),
                renderFor = eo.data('renderFor'),
                folder = eo.data('folder'); // 如果配置了 data-folder 属性，则临时覆盖初始化配置

            $file.data('valueFor', valueFor || '');
            $file.data('renderFor', renderFor || '');

            $file.off('change').on('change', function (e) {
                me.upload(e, folder || me.folder);
                me.form.reset();
                return false;
            });

            setTimeout(function () {
                $file.click();
            }, 0);

            return false;
        });


    },
    listover: [],
    /**
     * 列出目录里的文件(默认加载前20条)
     * @param folder 文件夹名
     * @param render 渲染方法名 
     * @param order  翻页顺序
     * 参看文档 https://www.qcloud.com/document/product/436/8095
     */
    list: function (folder, render, order) {
        var me = this;
        folder = folder || me.folder;
        order = order || 0; // order用于指定翻页顺序。若order填0，则从当前页正序/往下翻页；若order填1，则从当前页倒序/往上翻页
        !me.listover[folder] && me.cos.getFolderList(function (res) {
            if (res.code == 0) {
                render && render.call(me, res.data.infos, res.data.listover);
                if (!res.data.listover) {
                    me._folderContext = res.data.context;
                } else {
                    me._folderContext = null;
                    me.listover[folder] = true;
                }
                return res.data;
            }
        }, function errorCallBack() {}, me.bucket, folder, order, me._folderContext);
    },
    preload: function () {
        var me = this;
        var id = 'cos_form';
        var form = document.getElementById(id);
        if (!form) {
            form = document.createElement('form');
            form.id = id;
            form.innerHTML = '<input type="file" style="display:none;"/>';
            document.body.appendChild(form);
            me.form = form;
            me.$file = $('input[type="file"]', me.form);

            $.getScript('/js/crypto.js', function () {
                // console.log('[QCloud Crypto Loaded]');
                $.getScript('/js/cos-js-sdk-v4.js', function () {
                    // console.log('[QCloud JS SDK Loaded]');
                    me.init();
                    me.events(me.targets);
                    me.load && me.load.call(me);
                });
            });
        }
    },
    delete: function(filename, callback){
        var folder = this.formatFolder(this.folder);
        this.cos.deleteFile(function(res){
            if(res.code == 0){
                callback && callback(filename);
            }
        }, function errorCallBack(){}, this.bucket, folder + filename);
    },
    init: function () {
        var me = this;
        me.cos = new CosCloud({
            appid: me.appid,
            bucket: me.bucket,
            region: me.region,
            getAppSign: function (callback) {       // 获取签名 必填参数
                me.sign(me.folder, true, callback);
            },
            getAppSignOnce: function (callback) {   // 单次签名，参考上面的注释即可
                me.sign(null, null, callback);
            }
        });
    }
};