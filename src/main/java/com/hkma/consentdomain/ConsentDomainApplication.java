package com.hkma.consentdomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.hkma.consentdomain"})
public class ConsentDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsentDomainApplication.class, args);
	}

}
