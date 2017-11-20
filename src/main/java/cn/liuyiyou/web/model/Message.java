/**
 * <p> 
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
package cn.liuyiyou.web.model;

import cn.liuyiyou.web.enums.MessageStatus;

import java.io.Serializable;

/**
 * 短消息<br>
 * 数据表 <code>t_message</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
public class Message extends PageEntity implements Serializable {

    /** 序列化ID，t_message */
    private static final long serialVersionUID = 1L;

    /** ID，对应的数据库字段为 <code>t_message.msg_id</code> */
    private Integer msgId;

    /** 发送者ID，对应的数据库字段为 <code>t_message.msg_from</code> */
    private String msgFrom;

    /** 接受者ID，对应的数据库字段为 <code>t_message.msg_to</code> */
    private String msgTo;

    /** 信息标题，对应的数据库字段为 <code>t_message.msg_title</code> */
    private String msgTitle;

    /** 消息内容，对应的数据库字段为 <code>t_message.msg_content</code> */
    private String msgContent;

    /** 消息状态，对应的数据库字段为 <code>t_message.msg_status</code> */
    //private Byte msgStatus;
    private MessageStatus msgStatus;

    /**
     * 获取ID，对应的数据库字段为 <code>t_message.msg_id</code>
     *
     * @return ID
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * 设置ID，对应的数据库字段为 <code>t_message.msg_id</code>
     *
     * @param msgId ID
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * 获取发送者ID，对应的数据库字段为 <code>t_message.msg_from</code>
     *
     * @return 发送者ID
     */
    public String getMsgFrom() {
        return msgFrom;
    }

    /**
     * 设置发送者ID，对应的数据库字段为 <code>t_message.msg_from</code>
     *
     * @param msgFrom 发送者ID
     */
    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom == null ? null : msgFrom.trim();
    }

    /**
     * 获取接受者ID，对应的数据库字段为 <code>t_message.msg_to</code>
     *
     * @return 接受者ID
     */
    public String getMsgTo() {
        return msgTo;
    }

    /**
     * 设置接受者ID，对应的数据库字段为 <code>t_message.msg_to</code>
     *
     * @param msgTo 接受者ID
     */
    public void setMsgTo(String msgTo) {
        this.msgTo = msgTo == null ? null : msgTo.trim();
    }

    /**
     * 获取信息标题，对应的数据库字段为 <code>t_message.msg_title</code>
     *
     * @return 信息标题
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     * 设置信息标题，对应的数据库字段为 <code>t_message.msg_title</code>
     *
     * @param msgTitle 信息标题
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    /**
     * 获取消息内容，对应的数据库字段为 <code>t_message.msg_content</code>
     *
     * @return 消息内容
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * 设置消息内容，对应的数据库字段为 <code>t_message.msg_content</code>
     *
     * @param msgContent 消息内容
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    /**
     * 获取消息状态，对应的数据库字段为 <code>t_message.msg_status</code>
     *
     * @return 消息状态
     */
    public MessageStatus getMsgStatus() {
        return msgStatus;
    }

    /**
     * 设置消息状态，对应的数据库字段为 <code>t_message.msg_status</code>
     *
     * @param msgStatus 消息状态
     */
    public void setMsgStatus(MessageStatus msgStatus) {
        this.msgStatus = msgStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", msgId=").append(msgId);
        sb.append(", msgFrom=").append(msgFrom);
        sb.append(", msgTo=").append(msgTo);
        sb.append(", msgTitle=").append(msgTitle);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", msgStatus=").append(msgStatus);
        sb.append("]");
        return sb.toString();
    }
}