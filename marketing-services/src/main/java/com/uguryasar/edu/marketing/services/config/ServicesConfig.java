package com.uguryasar.edu.marketing.services.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.uguryasar.edu.marketing")
public class ServicesConfig {

    public static void main(String[] args) {
        SpringApplication.run(ServicesConfig.class);
    }

}
