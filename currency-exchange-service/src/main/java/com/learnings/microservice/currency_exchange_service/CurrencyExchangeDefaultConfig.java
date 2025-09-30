package com.learnings.microservice.currency_exchange_service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "currency.default")
public class CurrencyExchangeDefaultConfig {
    private String baseCurrency;
    private String displayCurrency;
}
