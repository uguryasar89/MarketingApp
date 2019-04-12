package com.uguryasar.edu.marketing.controller.rest;

import com.uguryasar.edu.marketing.controller.dto.StatusDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Bu sınıfın metodlarının Rest servisi yapar.
public class HomeController {

    @GetMapping("/") // Bu metoda "/" adresi ile erişilmesini sağlar.
    public String welcome() {
        return "Welcome to MarketingApp";
    }

    @GetMapping("/status") // Bu metoda /status adresi ile erişilmesini sağlar
    public StatusDto status() {
        StatusDto status = new StatusDto();

        status.setStatus(200);
        status.setMessage("application is up");

        return status;
    }

}
