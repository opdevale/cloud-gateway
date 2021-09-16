package com.bank.api.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	
public int getValue(String s) {
		
		char[] chars = s.toCharArray();
		int length = s.length();
		int total = 0;
		for(int i=0;i<s.length();i++) {
			int x = (int)(chars[i]) - '0';
			
			for(int j=length-1;j>0;j--) {
				x = x* 10;
			}
			length--;
			total=total + x;
		}
		
		return total;
	}
}
