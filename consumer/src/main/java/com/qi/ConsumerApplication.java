package com.qi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient  // 开启发现服务
@SpringBootApplication
@EnableHystrix     //启动容错保护
@ServletComponentScan("com.qi.servlet")
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@LoadBalanced // 启用负载均衡服务
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
