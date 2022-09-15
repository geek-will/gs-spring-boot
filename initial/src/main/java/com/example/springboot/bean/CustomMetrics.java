package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.assembler.AbstractMBeanInfoAssembler;
import org.springframework.jmx.support.MetricType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ManagedResource
public class CustomMetrics
{
    private String customMetricsName = "custom_metrics_name";

    @ManagedAttribute
    public String getCustomMetricsName()
    {
        return customMetricsName;
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
        return 888;
    }

//    public static class MyMBeanInfoAssembler
//            extends AbstractMBeanInfoAssembler
//    {
//
//    }
}
