package com.tw.RateProvider.service;

import com.tw.RateProvider.domain.Rate;

import java.util.List;

public interface MockRateService {
    List<Rate> getRateByHotel(String hotelCode);


}
