package com.javastaff.tracing.opentelemetrya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Service2 {
	
	private Logger logger=LoggerFactory.getLogger(Service2.class);
	
	public void hello() {
		logger.info("Something");
	}
}
