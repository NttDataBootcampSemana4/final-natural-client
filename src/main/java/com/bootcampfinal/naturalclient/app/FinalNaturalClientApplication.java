package com.bootcampfinal.naturalclient.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FinalNaturalClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalNaturalClientApplication.class, args);
	}

}
