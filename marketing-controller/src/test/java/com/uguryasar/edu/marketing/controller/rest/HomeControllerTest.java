package com.uguryasar.edu.marketing.controller.rest;


import com.uguryasar.edu.marketing.controller.config.ControllerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ControllerConfig.class)
public class HomeControllerTest {

    @Test
    public void testWelcome() {
        System.out.println("Test method");
    }

}
