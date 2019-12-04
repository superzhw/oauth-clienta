package com.taiji.oauthclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class OauthClientaApplication {

    @GetMapping("user")
    public Authentication user(Authentication user){
        return  user;
    }

    public static void main(String[] args) {
        SpringApplication.run(OauthClientaApplication.class, args);
        System.out.println("客户端A启动！！！");
    }

}
