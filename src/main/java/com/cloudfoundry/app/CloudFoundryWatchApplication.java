package com.cloudfoundry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class CloudFoundryWatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFoundryWatchApplication.class, args);
	}
}
