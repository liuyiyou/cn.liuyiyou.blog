/**
 * <p> 
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
package cn.liuyiyou.web.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据表 <code>t_tag</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
public class Tag extends PageEntity implements Serializable {

    /** 序列化ID，t_tag */
    private static final long serialVersionUID = 1L;

    /** ，对应的数据库字段为 <code>t_tag.id</code> */
    private Integer tagId;

    /** ，对应的数据库字段为 <code>t_tag.blog_id</code> */
    private Integer blogId;

    /** ，对应的数据库字段为 <code>t_tag.name</code> */
    private String name;

    /** ，对应的数据库字段为 <code>t_tag.create_time</code> */
    private Date createTime;

    /** ，对应的数据库字段为 <code>t_tag.update_time</code> */
    private Date updateTime;

    /**
     * 获取id，对应的数据库字段为 <code>t_tag.id</code>
     *
     * @return id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置id，对应的数据库字段为 <code>t_tag.id</code>
     *
     * @param tagId id
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取blog_id，对应的数据库字段为 <code>t_tag.blog_id</code>
     *
     * @return blog_id
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * 设置blog_id，对应的数据库字段为 <code>t_tag.blog_id</code>
     *
     * @param blogId blog_id
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * 获取name，对应的数据库字段为 <code>t_tag.name</code>
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name，对应的数据库字段为 <code>t_tag.name</code>
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取create_time，对应的数据库字段为 <code>t_tag.create_time</code>
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time，对应的数据库字段为 <code>t_tag.create_time</code>
     *
     * @param createTime create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取update_time，对应的数据库字段为 <code>t_tag.update_time</code>
     *
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update_time，对应的数据库字段为 <code>t_tag.update_time</code>
     *
     * @param updateTime update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", tagId=").append(tagId);
        sb.append(", blogId=").append(blogId);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}