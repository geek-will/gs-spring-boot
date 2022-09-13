package com.example.springboot.bean;

public interface CustomService
{
    /**
     * Gets server name.
     */
    public String getServiceName();

    /**
     * Whether or not the server is running.
     */
    public boolean isServiceRunning();
}
