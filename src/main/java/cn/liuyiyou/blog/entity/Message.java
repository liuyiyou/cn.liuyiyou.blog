/**
 * <p>
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
package cn.liuyiyou.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message implements Serializable {

    private Integer id;
    private String content;
    private Integer fromId;
    private Integer toId;
    private Date createTime;
    private Date updateTime;
}