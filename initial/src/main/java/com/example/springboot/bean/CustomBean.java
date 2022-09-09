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
    @Value("${gateway.version: INTERNAL_SG_STABLE_0.5.2-4}")
    public String gatewayVersion;

    @ManagedAttribute(description="custom_gateway_version")
    public String getValue()
    {
        return gatewayVersion;
    }
}
