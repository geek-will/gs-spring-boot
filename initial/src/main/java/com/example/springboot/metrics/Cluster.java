package com.example.springboot.metrics;

import java.time.Instant;

import static java.util.Objects.requireNonNull;

public class Cluster
{
    private final String name;
    private final String ip;
    private final Long updateTime;
    private final int activeStatus;

    public Cluster(
            String clusterName,
            String clusterIp,
            int activeStatus)
    {
        this.name = requireNonNull(clusterName, "clusterName is null");
        this.ip = requireNonNull(clusterIp, "clusterIp is null");
        this.activeStatus = requireNonNull(activeStatus, "activeStatus is null");
        this.updateTime = Instant.now().getEpochSecond();
    }

    public String getName()
    {
        return name;
    }

    public String getIp()
    {
        return ip;
    }

    public Long getUpdateTime()
    {
        return updateTime;
    }

    public int getActiveStatus()
    {
        return activeStatus;
    }
}
