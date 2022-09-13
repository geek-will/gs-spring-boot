package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName= "com.sdi.presto.gateway:type=CustomBean")
public class CustomBean
{
    @Value("${gateway.version}")
    private String gatewayVersion;

    private String beanName = "custom_bean";

    @ManagedAttribute(description="custom_bean_name", defaultValue = "custom_bean_name")
    public String getBeanName()
    {
        return beanName + " : " + gatewayVersion;
    }

    @ManagedAttribute(description="custom_bean_value")
    public Long getBeanValue()
    {
        return 888L;
    }
}
