package com.example.springboot.services;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MultiGauge;
import io.micrometer.core.instrument.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;
import java.util.stream.Collectors;

@Component
public class MetricsExporter
{
    private final MultiGauge allClusterStatus;
    private final CustomService customService;
    private final ClusterMonitorService clusterMonitorService;

    @Autowired
    public MetricsExporter(MeterRegistry registry,
            @Lazy CustomService customService,
            @Lazy ClusterMonitorService clusterMonitorService)
    {
        this.customService = customService;
        this.clusterMonitorService = clusterMonitorService;

        Gauge.builder("custom.service.version", customServiceVersion()).
                tag("custom.service.name", customService.getName()).
                tag("custom.service.teg", "test").
                description("Version of custom service.").
                register(registry);

        allClusterStatus = MultiGauge.builder("all.cluster.status")
                .tag("name","name")
                .tag("Ip","Ip")
                .description("Status of all clusters")
                .register(registry);
    }

    public Supplier<Number> customServiceVersion() {
        return ()->customService.getVersion();
    }

    public void updateAllClusterStatus()
    {
        boolean overWrite = false;
        // Register activeStatus of clusters
        allClusterStatus.register(
                clusterMonitorService.getClusters().stream().map(
                        cluster -> MultiGauge.Row.of(Tags.of("name", cluster.getName(), "Ip", cluster.getIp()), cluster.getActiveStatus())
                ).collect(Collectors.toList()),
                overWrite
        );

        // Register updateTime of clusters
        allClusterStatus.register(
                clusterMonitorService.getClusters().stream().map(
                        cluster -> MultiGauge.Row.of(Tags.of("name", cluster.getName(), "Ip", cluster.getIp()), cluster.getUpdateTime())
                ).collect(Collectors.toList()),
                overWrite
        );
    }
}
