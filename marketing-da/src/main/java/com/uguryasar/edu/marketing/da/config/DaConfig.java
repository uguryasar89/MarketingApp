package com.uguryasar.edu.marketing.da.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.uguryasar.edu.marketing")
public class DaConfig {

    public static void main(String[] args) {
        SpringApplication.run(DaConfig.class);
    }

}
