package com.example.demo1;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

//    @Bean
//    @LoadBalanced
//    OAuth2RestTemplate oAuth2RestTemplate(UserInfoRestTemplateFactory userInfoRestTemplateFactory){
//        return userInfoRestTemplateFactory.getUserInfoRestTemplate();
//    }
}
