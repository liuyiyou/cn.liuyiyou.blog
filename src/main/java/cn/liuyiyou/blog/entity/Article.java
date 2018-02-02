
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
public class Article implements Serializable {

    private Integer id;
    private String introduction;
    private String title;
    private String attachment;
    private String categoryName;
    private String image = "https://cdn-isux.qq.com/upload/detail/0zjkwXfuQwsmmqpCpYtn2BQEDGcsbPGTZzC7UJVengA.jpg";
    private String image1x;
    private String permalink;
    private Integer richRecommended;
    private Integer sticky;
    private String content;
    private Date createTime;
    private Date updateTime;
}