package com.uguryasar.edu.marketing.services.sample;

import com.uguryasar.edu.marketing.services.config.ServicesConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ServicesConfig.class)
public class SampleServiceTest {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testGetItemCountByBrand() {
        Assert.assertNotNull(sampleService);

        Assert.assertEquals(5, sampleService.getItemCountByBrand());
    }

}
