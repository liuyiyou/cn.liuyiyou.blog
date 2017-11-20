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
import java.util.List;


/**
 * 数据表 <code>t_blog</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
public class Blog extends PageEntity implements Serializable {

    /**
     * 博客包含的标签
     */
    private List<Tag> tags;

    /**
     * 得到ID
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /** 序列化ID，t_blog */
    private static final long serialVersionUID = 1L;

    /** ，对应的数据库字段为 <code>t_blog.blog_id</code> */
    private Integer blogId;

    /** ，对应的数据库字段为 <code>t_blog.title</code> */
    private String title;

    /** ，对应的数据库字段为 <code>t_blog.author</code> */
    private String author;

    /** ，对应的数据库字段为 <code>t_blog.content</code> */
    private String content;

    /** ，对应的数据库字段为 <code>t_blog.is_del</code> */
    private Byte isDel;

    /** ，对应的数据库字段为 <code>t_blog.create_time</code> */
    private Date createTime;

    /** ，对应的数据库字段为 <code>t_blog.update_time</code> */
    private Date updateTime;

    /**
     * 获取blogId，对应的数据库字段为 <code>t_blog.id</code>
     *
     * @return blogId
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * 设置id，对应的数据库字段为 <code>t_blog.id</code>
     *
     * @param blogId blogId
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * 获取title，对应的数据库字段为 <code>t_blog.title</code>
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title，对应的数据库字段为 <code>t_blog.title</code>
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取author，对应的数据库字段为 <code>t_blog.author</code>
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置author，对应的数据库字段为 <code>t_blog.author</code>
     *
     * @param author author
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 获取content，对应的数据库字段为 <code>t_blog.content</code>
     *
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content，对应的数据库字段为 <code>t_blog.content</code>
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取is_del，对应的数据库字段为 <code>t_blog.is_del</code>
     *
     * @return is_del
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置is_del，对应的数据库字段为 <code>t_blog.is_del</code>
     *
     * @param isDel is_del
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取create_time，对应的数据库字段为 <code>t_blog.create_time</code>
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time，对应的数据库字段为 <code>t_blog.create_time</code>
     *
     * @param createTime create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取update_time，对应的数据库字段为 <code>t_blog.update_time</code>
     *
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update_time，对应的数据库字段为 <code>t_blog.update_time</code>
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
        sb.append(", blogId=").append(blogId);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", content=").append(content);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}