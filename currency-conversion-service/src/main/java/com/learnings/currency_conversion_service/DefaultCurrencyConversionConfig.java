package com.learnings.currency_conversion_service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "currency.default")
public class DefaultCurrencyConversionConfig {
    private double baseAmount;
    private double convertAmount;
}
