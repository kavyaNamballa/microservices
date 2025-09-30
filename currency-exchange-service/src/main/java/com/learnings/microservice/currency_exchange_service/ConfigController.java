package com.learnings.microservice.currency_exchange_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final CurrencyExchangeDefaultConfig currency;

    @GetMapping("/currency-config")
    public CurrencyExchangeDefaultConfig contactConfig() {
        return currency;
    }

}
