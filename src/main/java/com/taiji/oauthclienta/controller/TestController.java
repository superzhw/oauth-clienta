package com.taiji.oauthclienta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("test1")
    public String test1() {
        return "home";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2() {
        return "客户端A1";
    }
}
