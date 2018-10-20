package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * 浏览器访问http://localhost:8080/springmvc/helloworld
     * 通过@RequestMapping 注解匹配映射请求的 URL，找到对应的方法。
     * 方法执行后返回 "helloworld"字符串 。通过 视图解析器 解析机制(prefix + returnVal + suffix)
     * 请求返回跳转页面 /WEB-INF/views/hello.jsp
     */
    @RequestMapping("/helloworld")
    public String helloWorld() {
        System.out.println("^^^^^^^^^^^^^^^^HelloWorld1");
        return "helloworld";
    }

}