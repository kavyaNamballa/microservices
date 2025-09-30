package com.learnings.microservice.spring_cloud_config_server;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "contact")
public record ContactConfiguration(String name, String email, List<String> phoneNumber) {
}
