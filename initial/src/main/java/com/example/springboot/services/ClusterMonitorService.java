package com.example.springboot.services;

import com.example.springboot.metrics.Cluster;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClusterMonitorService
{
    private List<Cluster> clusters;

    public ClusterMonitorService()
    {
        clusters = Arrays.asList(
                new Cluster("presto_test01", "10.128.151.166", 1),
                new Cluster("presto_test02", "10.128.151.167", 0),
                new Cluster("presto_test03", "10.128.151.168", 1));
    }

    public List<Cluster> getClusters()
    {
        return clusters;
    }
}
