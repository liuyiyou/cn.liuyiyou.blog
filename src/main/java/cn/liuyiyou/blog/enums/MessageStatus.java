package cn.liuyiyou.blog.enums;

/**
 * 消息状态枚举类
 *
 * @author: liuyiyou
 * @date: 2017/11/18
 * Time: 下午6:04
 */
public enum MessageStatus {

    UNREAD((byte) 0, "未读"),

    READ((byte) 1, "未读"),;




    private byte status;

    private String value;

    MessageStatus(byte status, String value) {
        this.status = status;
        this.value = value;
    }


    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
