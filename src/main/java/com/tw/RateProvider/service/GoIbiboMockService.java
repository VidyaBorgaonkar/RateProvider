package com.tw.RateProvider.service;

import com.tw.RateProvider.domain.Rate;
import com.tw.RateProvider.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "GOService")
public class GoIbiboMockService implements MockRateService {
    @Autowired
    private RateRepository rateRepository;

    public GoIbiboMockService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @Override
    public List<Rate> getRateByHotel(String hotelCode) {

        return rateRepository.getRatesByHotel(hotelCode,"GOIBIBO");
    }


}
