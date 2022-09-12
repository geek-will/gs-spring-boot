package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.sdi.presto.gateway:type=CustomBean")
public class CustomBean
{
//    @Value("${gateway.version}")
    public String gatewayVersion = "INTERNAL_SG_STABLE_0.5.2-4";

    @ManagedAttribute(description="version")
    public Long getVersion()
    {
        return 888L;
    }

    @ManagedAttribute(description="version_value")
    public String getValue()
    {
        return "INTERNAL_SG_STABLE_0.5.2-4";
    }
}
