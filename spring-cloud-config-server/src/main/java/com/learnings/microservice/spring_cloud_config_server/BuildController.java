package com.learnings.microservice.spring_cloud_config_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildController {
    @Value("${build.version}")
    private String buildVersion;

    @GetMapping("/build-version")
    public String getBuildVersion() {
        return buildVersion;
    }
}

