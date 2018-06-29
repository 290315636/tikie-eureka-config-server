package com.tikie.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TikieEurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TikieEurekaConfigServerApplication.class, args);
	}
}
