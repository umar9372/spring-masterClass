package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;



public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Shaikh Umar","pass123", "email@gmail.com"),
                new Customer(2L, "Shaikh Zeeshan","pass321", "email@gmail.com"),
                new Customer(3L, "Shaikh Minhaj","pass098", "email@gmail.com")
        );
    }
}
