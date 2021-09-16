package com.bank.api.proxy;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {

	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/hotelBooking/**")
                        .uri("http://laptop-sknl19fq:8089/"))
                .route(r -> r.path("/hotelRegistration/**")
                        .uri("http://laptop-sknl19fq:8082/"))                
                .build();
    }

}
