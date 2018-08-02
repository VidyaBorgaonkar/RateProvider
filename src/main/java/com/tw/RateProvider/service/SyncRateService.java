package com.tw.RateProvider.service;

import com.tw.RateProvider.domain.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class SyncRateService {
    @Autowired
    @Qualifier("AGODAService")
    private AgodaMockService agodaMockService;

    @Autowired
    @Qualifier("MMTService")
    private MakeMyTripMockService makeMyTripMockService;

    @Autowired
    @Qualifier("GOService")
    private GoIbiboMockService goIbiboMockService;



    public SyncRateService(AgodaMockService agodaMockService, MakeMyTripMockService makeMyTripMockService, GoIbiboMockService goIbiboMockService) {
        this.agodaMockService = agodaMockService;
        this.makeMyTripMockService = makeMyTripMockService;
        this.goIbiboMockService = goIbiboMockService;
    }

    public List<Rate> getRates(String hotel_code) {

       return Stream.of(this.agodaMockService, this.goIbiboMockService, this.makeMyTripMockService)
                .map(service -> service.getRateByHotel(hotel_code)).flatMap(List::stream).collect(Collectors.toList());


    }
}
