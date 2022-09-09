package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.example.springboot.bean:name=customBean")
public class CustomBean
{
    public Long gatewayVersion = 911L;

    @ManagedAttribute(description="custom_gateway_version")
    public Long getValue()
    {
        return gatewayVersion;
    }
}
