//package cn.liuyiyou.blog.service;
//
//import cn.liuyiyou.AbstractTest;
//import cn.liuyiyou.blog.entity.Tag;
//import com.github.pagehelper.PageInfo;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * @author: liuyiyou
// * @date: 2017/11/17
// * Time: 下午10:56
// */
//public class TagServiceTest extends AbstractTest {
//
//    @Autowired
//    public TagService tagService;
//
//    @Test
//    public void selectByParam(){
//        Tag tag = new Tag();
//        tag.setBlogId(1);
//        PageInfo<Tag> tags = tagService.selectByParamsWithPage(tag);
//        assertEquals(tags.getList().size(),2);
//    }
//
//}
