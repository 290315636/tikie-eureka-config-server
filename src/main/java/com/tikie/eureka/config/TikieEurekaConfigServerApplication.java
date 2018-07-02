package com.tikie.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer     // 激活对配置中心的支持
@EnableDiscoveryClient  // 激活对注册中心的支持
@SpringBootApplication
public class TikieEurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TikieEurekaConfigServerApplication.class, args);
	}
}
