package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.example.springboot.bean:name=customBean" , description= "Testing: export custom metrics via jmx-exporter" )
public class CustomBean
{
    @Value("${gateway.version}")
    private String gatewayVersion;

    @ManagedAttribute(description="GATEWAY_VERSION")
    public String getValue()
    {
        return gatewayVersion;
    }
}
