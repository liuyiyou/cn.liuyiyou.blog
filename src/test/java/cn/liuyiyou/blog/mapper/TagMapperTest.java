//package cn.liuyiyou.blog.mapper;
//
//import cn.liuyiyou.AbstractTest;
//import cn.liuyiyou.blog.entity.Tag;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * @author: liuyiyou
// * @date: 2017/11/17
// * Time: 下午10:56
// */
//public class TagMapperTest extends AbstractTest {
//
//    @Autowired
//    public TagMapper tagMapper;
//
//    @Test
//    public void selectByParam(){
//        Tag tag = new Tag();
//        tag.setBlogId(1);
//        List<Tag> tags = tagMapper.selectByParams(tag);
//        assertEquals(tags.size(),2);
//    }
//
//}
