package com.springmvc.controller;

/**
 * Created by gcy0904 on 2017/1/20.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/view")
    public String view(){
        System.out.println("你已通过springMVC进入controller方法。。。。");
        return "index";
    }
}
