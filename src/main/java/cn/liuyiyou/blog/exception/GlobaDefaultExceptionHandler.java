package cn.liuyiyou.blog.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * 返回json数据或者String数据：
 * 那么需要在方法上加上注解：@ResponseBody
 * 添加return即可。
 * <p>
 * 返回视图：
 * 定义一个ModelAndView即可，
 * 然后return;
 * 定义视图文件(比如：error.html,error.ftl,error.jsp);
 * <p>
 * @author : liuyiyou
 * Date: 2017/9/8
 * Time: 下午11:08
 */
@ControllerAdvice
public class GlobaDefaultExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "exception";

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("Global Exception :{} ", e);
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
