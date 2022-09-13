package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

@Service
@ManagedResource
public class CustomService
{
    @Autowired
    public String serviceName;

    @Autowired
    public CustomBean customBean;

    @Autowired
    public CustomMetrics customMetrics;

    @ManagedAttribute(description = "custom_service_name")
    public String getServiceName()
    {
        customBean.getBeanName();
        customBean.getBeanValue();
        customMetrics.getMetricsName();
        customMetrics.getMetricsValue();
        return this.serviceName;
    }
}
