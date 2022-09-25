package com.example.springboot.services;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Gauge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class MetricsExporter
{
    private final CustomService customService;

    @Autowired
    public MetricsExporter(MeterRegistry registry,
            @Lazy CustomService customService)
    {
        this.customService = customService;

        Gauge.builder("custom.service.version", customServiceVersion()).
                tag("custom.service.name", customService.getName()).
                tag("custom.service.teg", "test").
                description("Version of custom service.").
                register(registry);
    }

    public Supplier<Number> customServiceVersion() {
        return ()->customService.getVersion();
    }
}
