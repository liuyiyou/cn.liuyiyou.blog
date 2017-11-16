/**
 * <p> 
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-14
 * </p>
 */
package cn.liuyiyou.web.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据表 <code>user</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-14
 * </p>
 */
public class User extends PageEntity implements Serializable {

    /** 序列化ID，user */
    private static final long serialVersionUID = 1L;

    /** 会员ID由系统自动按注册时间顺序生成，对应的数据库字段为 <code>user.uid</code> */
    private Integer uid;

    /** 账号(电话号码)，对应的数据库字段为 <code>user.account</code> */
    private String account;

    /** 真实姓名，对应的数据库字段为 <code>user.real_name</code> */
    private String realName;

    /** ，对应的数据库字段为 <code>user.nickname</code> */
    private String nickname;

    /** 密码，对应的数据库字段为 <code>user.passwd</code> */
    private String passwd;

    /** 用户邮箱，对应的数据库字段为 <code>user.email</code> */
    private String email;

    /** 创建时间，对应的数据库字段为 <code>user.create_time</code> */
    private Date createTime;

    /** 注册渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信，对应的数据库字段为 <code>user.create_channel</code> */
    private Byte createChannel;

    /** 上一次登录时间，对应的数据库字段为 <code>user.last_time</code> */
    private Date lastTime;

    /** 上一次登录渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信, 5 手机WEB，对应的数据库字段为 <code>user.last_channel</code> */
    private Byte lastChannel;

    /** 上一次登录IP，对应的数据库字段为 <code>user.last_ip</code> */
    private String lastIp;

    /** 登录状态 0-下线 1-在线，对应的数据库字段为 <code>user.status</code> */
    private Byte status;

    /** 用户类型，1-C端用户；2-B端用户；3-都是，对应的数据库字段为 <code>user.user_type</code> */
    private Byte userType;

    /** 用户注册邀请码，对应的数据库字段为 <code>user.inv_code</code> */
    private String invCode;

    /** 推广来源：1-菜先鲜，对应的数据库字段为 <code>user.src</code> */
    private Byte src;

    /** 营销渠道来源，对应ibalife_report.report_from，对应的数据库字段为 <code>user.ditch</code> */
    private Integer ditch;

    /** 用户是否消费，对应的数据库字段为 <code>user.consume</code> */
    private Boolean consume;

    /** 归属地，对应的数据库字段为 <code>user.ower_ship</code> */
    private String owerShip;

    /**
     * 获取会员ID由系统自动按注册时间顺序生成，对应的数据库字段为 <code>user.uid</code>
     *
     * @return 会员ID由系统自动按注册时间顺序生成
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置会员ID由系统自动按注册时间顺序生成，对应的数据库字段为 <code>user.uid</code>
     *
     * @param uid 会员ID由系统自动按注册时间顺序生成
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取账号(电话号码)，对应的数据库字段为 <code>user.account</code>
     *
     * @return 账号(电话号码)
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号(电话号码)，对应的数据库字段为 <code>user.account</code>
     *
     * @param account 账号(电话号码)
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取真实姓名，对应的数据库字段为 <code>user.real_name</code>
     *
     * @return 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名，对应的数据库字段为 <code>user.real_name</code>
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取nickname，对应的数据库字段为 <code>user.nickname</code>
     *
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置nickname，对应的数据库字段为 <code>user.nickname</code>
     *
     * @param nickname nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取密码，对应的数据库字段为 <code>user.passwd</code>
     *
     * @return 密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置密码，对应的数据库字段为 <code>user.passwd</code>
     *
     * @param passwd 密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * 获取用户邮箱，对应的数据库字段为 <code>user.email</code>
     *
     * @return 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱，对应的数据库字段为 <code>user.email</code>
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取创建时间，对应的数据库字段为 <code>user.create_time</code>
     *
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间，对应的数据库字段为 <code>user.create_time</code>
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取注册渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信，对应的数据库字段为 <code>user.create_channel</code>
     *
     * @return 注册渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信
     */
    public Byte getCreateChannel() {
        return createChannel;
    }

    /**
     * 设置注册渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信，对应的数据库字段为 <code>user.create_channel</code>
     *
     * @param createChannel 注册渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信
     */
    public void setCreateChannel(Byte createChannel) {
        this.createChannel = createChannel;
    }

    /**
     * 获取上一次登录时间，对应的数据库字段为 <code>user.last_time</code>
     *
     * @return 上一次登录时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置上一次登录时间，对应的数据库字段为 <code>user.last_time</code>
     *
     * @param lastTime 上一次登录时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取上一次登录渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信, 5 手机WEB，对应的数据库字段为 <code>user.last_channel</code>
     *
     * @return 上一次登录渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信, 5 手机WEB
     */
    public Byte getLastChannel() {
        return lastChannel;
    }

    /**
     * 设置上一次登录渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信, 5 手机WEB，对应的数据库字段为 <code>user.last_channel</code>
     *
     * @param lastChannel 上一次登录渠道：1 PC web, 2 Android app, 3 iOS app， 4 微信, 5 手机WEB
     */
    public void setLastChannel(Byte lastChannel) {
        this.lastChannel = lastChannel;
    }

    /**
     * 获取上一次登录IP，对应的数据库字段为 <code>user.last_ip</code>
     *
     * @return 上一次登录IP
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置上一次登录IP，对应的数据库字段为 <code>user.last_ip</code>
     *
     * @param lastIp 上一次登录IP
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * 获取登录状态 0-下线 1-在线，对应的数据库字段为 <code>user.status</code>
     *
     * @return 登录状态 0-下线 1-在线
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置登录状态 0-下线 1-在线，对应的数据库字段为 <code>user.status</code>
     *
     * @param status 登录状态 0-下线 1-在线
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取用户类型，1-C端用户；2-B端用户；3-都是，对应的数据库字段为 <code>user.user_type</code>
     *
     * @return 用户类型，1-C端用户；2-B端用户；3-都是
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * 设置用户类型，1-C端用户；2-B端用户；3-都是，对应的数据库字段为 <code>user.user_type</code>
     *
     * @param userType 用户类型，1-C端用户；2-B端用户；3-都是
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * 获取用户注册邀请码，对应的数据库字段为 <code>user.inv_code</code>
     *
     * @return 用户注册邀请码
     */
    public String getInvCode() {
        return invCode;
    }

    /**
     * 设置用户注册邀请码，对应的数据库字段为 <code>user.inv_code</code>
     *
     * @param invCode 用户注册邀请码
     */
    public void setInvCode(String invCode) {
        this.invCode = invCode == null ? null : invCode.trim();
    }

    /**
     * 获取推广来源：1-菜先鲜，对应的数据库字段为 <code>user.src</code>
     *
     * @return 推广来源：1-菜先鲜
     */
    public Byte getSrc() {
        return src;
    }

    /**
     * 设置推广来源：1-菜先鲜，对应的数据库字段为 <code>user.src</code>
     *
     * @param src 推广来源：1-菜先鲜
     */
    public void setSrc(Byte src) {
        this.src = src;
    }

    /**
     * 获取营销渠道来源，对应ibalife_report.report_from，对应的数据库字段为 <code>user.ditch</code>
     *
     * @return 营销渠道来源，对应ibalife_report.report_from
     */
    public Integer getDitch() {
        return ditch;
    }

    /**
     * 设置营销渠道来源，对应ibalife_report.report_from，对应的数据库字段为 <code>user.ditch</code>
     *
     * @param ditch 营销渠道来源，对应ibalife_report.report_from
     */
    public void setDitch(Integer ditch) {
        this.ditch = ditch;
    }

    /**
     * 获取用户是否消费，对应的数据库字段为 <code>user.consume</code>
     *
     * @return 用户是否消费
     */
    public Boolean getConsume() {
        return consume;
    }

    /**
     * 设置用户是否消费，对应的数据库字段为 <code>user.consume</code>
     *
     * @param consume 用户是否消费
     */
    public void setConsume(Boolean consume) {
        this.consume = consume;
    }

    /**
     * 获取归属地，对应的数据库字段为 <code>user.ower_ship</code>
     *
     * @return 归属地
     */
    public String getOwerShip() {
        return owerShip;
    }

    /**
     * 设置归属地，对应的数据库字段为 <code>user.ower_ship</code>
     *
     * @param owerShip 归属地
     */
    public void setOwerShip(String owerShip) {
        this.owerShip = owerShip == null ? null : owerShip.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", uid=").append(uid);
        sb.append(", account=").append(account);
        sb.append(", realName=").append(realName);
        sb.append(", nickname=").append(nickname);
        sb.append(", passwd=").append(passwd);
        sb.append(", email=").append(email);
        sb.append(", createTime=").append(createTime);
        sb.append(", createChannel=").append(createChannel);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", lastChannel=").append(lastChannel);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", status=").append(status);
        sb.append(", userType=").append(userType);
        sb.append(", invCode=").append(invCode);
        sb.append(", src=").append(src);
        sb.append(", ditch=").append(ditch);
        sb.append(", consume=").append(consume);
        sb.append(", owerShip=").append(owerShip);
        sb.append("]");
        return sb.toString();
    }
}