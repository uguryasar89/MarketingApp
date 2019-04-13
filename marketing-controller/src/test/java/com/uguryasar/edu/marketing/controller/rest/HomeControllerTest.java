package com.uguryasar.edu.marketing.controller.rest;


import com.uguryasar.edu.marketing.controller.config.ControllerConfig;
import com.uguryasar.edu.marketing.controller.dto.CustomerDto;
import com.uguryasar.edu.marketing.controller.dto.CustomerRequestDto;
import com.uguryasar.edu.marketing.controller.dto.StatusDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ControllerConfig.class)
//   ControllerConfig sınıfındaki ayarlarla test sınıfının çalışmasını sağlar.
// Bu uygulama web uygulaması olduğu için random randopm bir portta çalışmasını sağlar
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HomeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testWelcome() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/home/", String.class);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assert.assertEquals("Welcome to MarketingApp", responseEntity.getBody());

    }

    @Test
    public void testStatus() {
        ResponseEntity<StatusDto> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/home/status", StatusDto.class);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        StatusDto dto = responseEntity.getBody();

        Assert.assertNotNull(responseEntity.getBody());
        Assert.assertEquals("application is up", responseEntity.getBody().getMessage());

    }

    @Test
    public void testQueryCustomerByName() {
        CustomerRequestDto request = new CustomerRequestDto();
        request.setName("Uğur");

        ResponseEntity<CustomerDto> responseEntity = restTemplate.postForEntity("http://localhost:" + port + "/home/queryCustomerByName", request, CustomerDto.class);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        CustomerDto customerDto = responseEntity.getBody();
        Assert.assertNotNull(customerDto);
        Assert.assertEquals(123, customerDto.getCustomerID());

        request = new CustomerRequestDto();
        
        ResponseEntity<CustomerDto> responseEntity2 = restTemplate.postForEntity("http://localhost:" + port + "/home/queryCustomerByName", request, CustomerDto.class);

        Assert.assertEquals(HttpStatus.OK, responseEntity2.getStatusCode());
        Assert.assertNull(responseEntity2.getBody());


    }

}




























