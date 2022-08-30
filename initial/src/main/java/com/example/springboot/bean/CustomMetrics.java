package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.example.springboot.bean:name=customMetrics" , description= "Testing: export custom metrics via jmx-exporter" )
public class CustomMetrics
{
    @ManagedAttribute(description="CUSTOM_METRICS")
    public String getName()
    {
        return "custom_metrics";
    }
}
