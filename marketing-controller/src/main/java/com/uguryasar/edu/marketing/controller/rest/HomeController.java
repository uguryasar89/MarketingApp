package com.uguryasar.edu.marketing.controller.rest;

import com.uguryasar.edu.marketing.controller.dto.StatusDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/status")
    public StatusDto status() {
        StatusDto status = new StatusDto();

        status.setStatus(200);
        status.setMessage("application is up");

        return status;
    }

}
