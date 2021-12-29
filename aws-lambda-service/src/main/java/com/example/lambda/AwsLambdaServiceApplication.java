package com.example.lambda;

import java.util.List;
import java.util.function.Supplier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.lambda.domain.OrderDetails;
import com.example.lambda.repository.OrderRepository;

@SpringBootApplication
public class AwsLambdaServiceApplication {

	@Autowired
	private OrderRepository repo;
	
	@Bean
    public Supplier<List<OrderDetails>> orders() {
        return () -> repo.buildOrders();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaServiceApplication.class, args);
	}

}
