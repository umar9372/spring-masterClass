package com.example.demo.customer;


import com.example.demo.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {

    //instead of this we use @sl4j
    /*private final static Logger LOGGER =
            LoggerFactory.getLogger(CustomerService.class);*/

    private final CustomerRepository customerRepository; //to linkup with CustomerRepository


    /*@Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository; //Autowired constructor
    //Qualifier used to specifiy which implementations gonna used by specifying value
    }*/  // instead of this we use @allargsconstructor


    List<Customer> getCustomers() {

log.info("getCustomers was called");

        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException =
                            new NotFoundException("customer with id " + id + " not found");

                    log.error("error in getting Customer {}", id, notFoundException);
                    return notFoundException;
                        }
                );


    }
}
