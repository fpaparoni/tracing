package com.javastaff.tracing.opentelemetryb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppBController {
	
	@Autowired 
	private BService aservice;
	
    @GetMapping("service")
    public String helloControllerMethod() {
        return aservice.method();
    }
}