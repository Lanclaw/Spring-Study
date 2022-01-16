package com.lanclaw.config;

import com.lanclaw.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lanclaw.pojo")
@Import(LanclawConfig2.class)
public class LanclawConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
