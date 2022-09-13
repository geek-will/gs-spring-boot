package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

@Service
@ManagedResource(objectName= "com.sdi.presto.gateway:name=CustomServiceImpl")
public class CustomServiceImpl
        implements CustomService
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
        return this.serviceName;
    }

    @ManagedAttribute(description = "custom_service_name")
    public boolean isServiceRunning()
    {
        return true;
    }
}
