package com.example.lambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.lambda.domain.OrderDetails;

@Repository
public class OrderRepository {

	public List<OrderDetails> buildOrders(){
        return Stream.of(
        		new OrderDetails(112, "PC", 45000, 1),
                new OrderDetails(113, "PC MAC", 48000, 2)
                ).collect(Collectors.toList());
    }
	
}
