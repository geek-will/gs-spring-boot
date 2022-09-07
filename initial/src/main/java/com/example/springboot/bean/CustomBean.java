package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.example.springboot.bean:type=CustomBean")
public class CustomBean
{
    @Value("${gateway.version}")
    private String gatewayVersion;

    @ManagedAttribute(description="gateway_version")
    public String getValue()
    {
        return gatewayVersion;
    }
}
