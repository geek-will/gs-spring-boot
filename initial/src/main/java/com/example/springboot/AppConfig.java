package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public String serviceName()
    {
        return "test_service";
    }
}
