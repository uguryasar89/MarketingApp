package com.uguryasar.edu.marketing.controller.rest;

import com.uguryasar.edu.marketing.controller.dto.CustomerDto;
import com.uguryasar.edu.marketing.controller.dto.CustomerRequestDto;
import com.uguryasar.edu.marketing.controller.dto.StatusDto;
import org.springframework.web.bind.annotation.*;

@RestController // Bu sınıfın metodlarının Rest servisi yapar.
@RequestMapping("/home")
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

    @PostMapping("/queryCustomerByName")
    public CustomerDto queryCustomerByName(@RequestBody CustomerRequestDto requestDto) {

        if ("Uğur".equals(requestDto.getName())) {
            CustomerDto response = new CustomerDto();
            response.setCustomerID(123);
            response.setCustomerName("Uğur Yaşar");
            response.setCustomerAddress("İstanbul");

            return response;


        }

        return null;
    }

}
