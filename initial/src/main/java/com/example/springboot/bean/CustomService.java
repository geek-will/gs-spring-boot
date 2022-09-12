package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomService
{
    @Autowired
    public String serviceName;

    @Autowired
    public CustomBean customBean;

    @Autowired
    public CustomMetrics customMetrics;

    public String getServiceName()
    {
        return this.serviceName;
    }
}
