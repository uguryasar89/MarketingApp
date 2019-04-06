package com.uguryasar.edu.marketing.controller.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.uguryasar.edu.marketing")
public class ControllerConfig {

    public static void main(String[] args) {
        SpringApplication.run(ControllerConfig.class);
    }

}
