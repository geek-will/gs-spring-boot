package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.example.springboot.bean:name=customMetrics")
public class CustomMetrics
{
    public String customMetrics = "999";
    @ManagedAttribute(description="custom_metrics")
    public String getCustomMetrics()
    {
        return this.customMetrics;
    }
}
