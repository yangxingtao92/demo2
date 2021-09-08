package com.wfd360.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
    /**
     * 获取模拟数据
     */
    @RequestMapping("/data")
    @ResponseBody
    public String data() {
        System.out.println("---------Hello Jenkins----------");
        return "hello wordAAAAAA";
    }
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("---------Hello Jenkins----------");
        return "Hello Jenkins";
    }
}
