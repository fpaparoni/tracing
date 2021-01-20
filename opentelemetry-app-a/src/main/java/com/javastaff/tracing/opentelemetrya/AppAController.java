package com.javastaff.tracing.opentelemetrya;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppAController {
    
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test-tracing")
    public String entryPointController() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	HttpEntity<String> entity = new HttpEntity<>(headers);
    	String response=restTemplate.exchange("http://opentelemetry-app-b:9082/service", HttpMethod.GET, entity, String.class).getBody();	
    	
        return "Remote server said: "+response;
    }
}