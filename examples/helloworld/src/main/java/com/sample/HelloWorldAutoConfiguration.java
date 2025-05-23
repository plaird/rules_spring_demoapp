package com.sample;

import org.springframework.context.annotation.Bean;

public class HelloWorldAutoConfiguration {
    @Bean
    public String helloMessage() {
        return "Hello SpringBoot!";
    }
}
