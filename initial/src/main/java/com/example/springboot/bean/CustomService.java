package com.example.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

@Service
public class CustomService
{
    @Autowired
    public String serviceName;

    @Autowired
    public CustomBean customBean;

    @Autowired
    public CustomMetrics customMetrics;

    public CustomService()
    {
        try {
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("com.example.springboot.bean:name=customBean");
            mBeanServer.registerMBean(customBean, name);
        }
        catch (Exception e) {
            System.out.println("Error when : " + e.getMessage());
        }
    }

    public String getServiceName()
    {
        customBean.getValue();
        customMetrics.getCustomMetrics();
        return this.serviceName;
    }
}
