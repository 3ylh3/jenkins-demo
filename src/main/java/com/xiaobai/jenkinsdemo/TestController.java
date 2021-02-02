package com.xiaobai.jenkinsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Author yinzhaojing
 * @Date 2021-02-02 16:53:58
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "Hello World";
    }
}
