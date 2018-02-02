package cn.liuyiyou.blog.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleVo {
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
}
