package com.uguryasar.edu.marketing.services.sample;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public int getItemCountByBrand() {
        return 5;
    }

}
