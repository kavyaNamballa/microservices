package com.learnings.currency_conversion_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final DefaultCurrencyConversionConfig contact;

    @GetMapping("/currency-config")
    public DefaultCurrencyConversionConfig currencyConfig() {
        return contact;
    }

}
