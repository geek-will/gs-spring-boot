package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.sdi.presto.gateway:name=CustomBean")
public class CustomBean
{
    @Value("${gateway.version}")
    private String gatewayVersion;

    private String beanName = "custom_bean";

    private Long beanValue = 888L;

//    @ManagedAttribute(description="custom_bean_name", defaultValue = "custom_bean_name")
    @ManagedMetric(description="custom_bean_name")
    public String getBeanName()
    {
        return beanName + " : " + gatewayVersion;
    }

//    @ManagedAttribute(description="custom_bean_value")
    @ManagedMetric(category = "test", description="Value of custom beam", displayName = "custom_bean_value")
    public Long getBeanValue()
    {
        return beanValue;
    }
}
