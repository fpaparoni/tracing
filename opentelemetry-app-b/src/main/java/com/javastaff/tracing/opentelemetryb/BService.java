package com.javastaff.tracing.opentelemetryb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {
	
	@Autowired
    private TestEntityRepository repository;
	
	public String method() {
    	repository.findAll();
		return "Hello world";
	}
}
