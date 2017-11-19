package cn.liuyiyou.web.enums;

/**
 * 消息类型
 * @author: liuyiyou
 * @date: 2017/11/18
 * Time: 下午6:06
 */
public enum MessageType {

    NORMAL((byte) 0, "普通"),

    AD((byte) 1, "广告"),

    VERIFY((byte) 2, "验证邮件"),

    DRAFT((byte) 3, "草稿");


    private byte status;

    private String value;

    MessageType(byte status, String value) {
        this.status = status;
        this.value = value;
    }


}
