package com.example.springboot.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

import java.io.Serializable;

@ManagedResource
public class ClusterInfo
        implements Serializable
{
    public ClusterInfo(String name, int status)
    {
        this.name = name;
        this.status = status;
    }

    public String name;
    public int status;

    @ManagedAttribute
    public String getName()
    {
        return name;
    }

    @ManagedAttribute
    public int getStatus()
    {
        return status;
    }
}
