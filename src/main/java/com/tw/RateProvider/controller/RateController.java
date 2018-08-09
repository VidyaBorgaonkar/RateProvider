package com.tw.RateProvider.controller;

import com.tw.RateProvider.domain.Rate;
import com.tw.RateProvider.service.SyncRateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class RateController {

    private SyncRateService rateService;

    public RateController(SyncRateService rateService) {
        this.rateService = rateService;
    }

    @GetMapping("/get_rates/{hotel_code}")
    public List<Rate> getRates(@PathVariable String hotel_code) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(500);
        return rateService.getRates(hotel_code);
    }



}
