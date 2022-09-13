package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class CustomMetrics
{
    @ManagedOperation
    public String getCustomMetricsName()
    {
        return "custom_metrics_name";
    }

    @ManagedAttribute
    public Integer getCustomMetricsValue()
    {
        return 888;
    }
}
