package com.example.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

