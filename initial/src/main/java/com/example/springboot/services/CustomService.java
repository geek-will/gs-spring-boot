package com.example.springboot.services;

import org.springframework.stereotype.Service;

@Service
public class CustomService
{
    private String name = "metrics-integrate-service";
    private Double version = 0.01;

    public String getName()
    {
        return this.name;
    }

    public Double getVersion()
    {
        return this.version;
    }
}
