package com.taiji.oauthclienta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("logout")
    public void logout() {
        System.out.println("登出");
    }
}
