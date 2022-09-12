package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.sdi.presto.gateway:type=CustomMetrics")
public class CustomMetrics
{
    public Integer customMetrics = 999;

    @ManagedAttribute(description="custom_metrics_name")
    public String getMetricsName()
    {
        return "custom_metrics";
    }
    @ManagedAttribute(description="custom_metrics_value")
    public Integer getMetricsValue()
    {
        return this.customMetrics;
    }
}
