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
    private String gatewayVersion = "INTERNAL_SG_STABLE_0.5.2-4";

    private String beanName = "custom_bean";

    @ManagedAttribute(description="custom_bean_name")
    public String getBeanName()
    {
        return beanName;
    }

    @ManagedAttribute(description="custom_bean_value")
    public Long getBeanValue()
    {
        return 888L;
    }
}
