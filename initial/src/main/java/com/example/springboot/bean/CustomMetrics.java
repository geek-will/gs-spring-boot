package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import javax.management.NotificationBroadcasterSupport;

@Component
@ManagedResource
public class CustomMetrics extends NotificationBroadcasterSupport
{
    @ManagedAttribute(description="CUSTOM_METRICS")
    public String getName()
    {
        return "custom_metrics";
    }
}
