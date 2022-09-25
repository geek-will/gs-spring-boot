package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.jmx.export.annotation.ManagedNotification;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.support.MetricType;
import org.springframework.stereotype.Component;
import org.springframework.jmx.support.JmxUtils;

@Component
@ManagedResource
public class CustomMetrics
{
    private String customMetricsName = "custom_metrics_name";
    private int customMetricsValue = 888;

    @ManagedAttribute
    public String getCustomMetricsName()
    {
        return customMetricsName;
    }

    @ManagedAttribute
    public Integer getCustomMetricsValue()
    {
        return customMetricsValue;
    }
}
