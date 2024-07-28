package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api/v1/customers")
@RestController
@Deprecated //Deprecate means we not using this
public class CustomerController {

    private final CustomerService customerService;//to linkup with CustomerService

    @Autowired
    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;

    }


    @GetMapping(value = "all")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping
    void updateNewCustomer(@RequestBody Customer customer) {
        System.out.println("PUT REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = {"customerId"})

    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID " + id);
    }
}
