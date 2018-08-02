package com.tw.RateProvider.service;

import com.tw.RateProvider.domain.Rate;
import com.tw.RateProvider.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "MMTService")
public class MakeMyTripMockService implements MockRateService {

    @Autowired
    private RateRepository rateRepository;

    public MakeMyTripMockService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @Override
    public List<Rate> getRateByHotel(String hotelCode) {

        return rateRepository.getRatesByHotel(hotelCode,"MMT");
    }
}
