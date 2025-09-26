package com.learnings.microservice.currency_exchange_service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SampleApiController {
    @GetMapping("/hello")
//    @Retry(name = "sample-api", fallbackMethod = "sampleFallback")
//    @CircuitBreaker(name = "sample-api", fallbackMethod = "sampleFallback")
    @RateLimiter(name = "sample-api")
    public String hello() {
        log.info("Sample Api call received");
//        int rem = 2/0;
        return "Hiiiii Kavya You'll have a great day 😍";
    }

    public String sampleFallback(Exception e) {
        log.error(e.getMessage());
        return "Hello World";
    }
}
