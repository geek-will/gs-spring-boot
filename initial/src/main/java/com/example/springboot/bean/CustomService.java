package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomService
{
    @Autowired
    private CustomMetrics customMetrics;

    public String getServiceName()
    {
        customMetrics.getCustomMetricsName();
        customMetrics.getCustomMetricsValue();
        return "custom_service";
    }
}
