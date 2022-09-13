package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class CustomMetrics
{
    private String metricsName = "custom_metrics";
    private Integer customMetrics = 999;

    @ManagedOperation
    public String getCustomMetrics()
    {
        return "custom_metrics";
    }

    @ManagedAttribute
    public String getMetricsName()
    {
        return metricsName;
    }

    @ManagedAttribute
    public Integer getMetricsValue()
    {
        return this.customMetrics;
    }
}
