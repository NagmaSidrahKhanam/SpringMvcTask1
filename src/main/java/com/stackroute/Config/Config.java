package com.stackroute.Config;

import com.stackroute.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
class Config {

    @Bean
    public User user(){

//        return new User("Sidrah",27);
        User user = new User();
        user.setName("Sidrah");
        return user;
    }
}