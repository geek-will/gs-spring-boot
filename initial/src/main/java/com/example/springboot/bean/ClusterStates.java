package com.example.springboot.bean;

import lombok.Data;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

@Component
@ManagedResource(objectName= "com.sdi.presto.gateway:name=clusterStates")
public class ClusterStates
{
    private List<String> clusters = new ArrayList<>();
    private List<ClusterInfo> clusterInfos = new ArrayList<>();
    private List<ResourceState> resourceStates = new ArrayList<>();

    public ClusterStates()
    {
        clusters.add("presto-test01");
        clusters.add("presto-test02");

        clusterInfos.add(new ClusterInfo("presto-test01", 0));
        clusterInfos.add(new ClusterInfo("presto-test02", 1));

        resourceStates.add(new ResourceState(
                "presto-test01",
                Collections.emptySet(),
                10,
                10,
                10,
                10,
                10
                ));
    }

    @ManagedAttribute(description = "cluster_name_list")
    public List<String> getClusters()
    {
        return clusters;
    }

//    @ManagedAttribute
    public List<ClusterInfo> getClusterInfos()
    {
        return clusterInfos;
    }

//    @ManagedAttribute
    public List<ResourceState> getResourceStates()
    {
        return resourceStates;
    }

    @Data
    public static class ResourceState
            implements Serializable
    {

        private String cluster;
        private Set<String> tags;
        private long totalVcores;
        private long runningQueries;
        private long queuedQueries;
        private double consumedVcores;
        private Double consumedMemory;

        public ResourceState(String cluster,
                             Set<String> tags,
                             long totalVcores,
                             long runningQueries,
                             long queuedQueries,
                             double consumedVcores,
                             double consumedMemory) {
            this.cluster = cluster;
            this.tags = tags;
            this.totalVcores = totalVcores;
            this.runningQueries = runningQueries;
            this.queuedQueries = queuedQueries;
            this.consumedVcores = consumedVcores;
            this.consumedMemory = consumedMemory;
        }

        // percentage
        public double getCpuUsage() {
            return Math.min(100.0, consumedVcores / totalVcores * 100.0);
        }
    }
}
