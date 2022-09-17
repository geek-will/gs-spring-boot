package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.assembler.AbstractMBeanInfoAssembler;
import org.springframework.jmx.support.MetricType;
import org.springframework.stereotype.Component;

import java.lang.management.MemoryPoolMXBean;
import java.util.HashMap;
import java.util.Map;

@Component
@ManagedResource
public class CustomMetrics
{
    private String customMetricsName = "custom_metrics_name";
    private int customMetricsValue = 888;

    @ManagedAttribute(defaultValue="custom_metrics_name", persistPeriod=300)
    public String getCustomMetricsName()
    {
        return customMetricsName;
    }

    @ManagedAttribute
    public void setCustomMetricsName(String customMetricsName) {
        this.customMetricsName = customMetricsName;
    }

    @ManagedOperation
    public Map<String, String> myMetrics()
    {
        Map<String, String> map = new HashMap<>();
        map.put("customMetricsName", "custom_metrics_name");
        return map;
    }

    @ManagedAttribute
    public Integer getCustomMetricsValue()
    {
        return customMetricsValue;
    }

    @ManagedAttribute
    public void setCustomMetricsValue(Integer customMetricsValue) {
        this.customMetricsValue = customMetricsValue;
    }
}
