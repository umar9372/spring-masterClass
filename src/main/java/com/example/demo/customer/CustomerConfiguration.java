package com.example.demo.customer;

import com.example.demo.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}") //Default false to implement real one
    //edit program arguments true to use this fake database
    private boolean useFakeCustomerRepo;


    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return args -> {
            System.out.println("Command line runner hooray");
            System.out.println(infoApp);

        };

    }




    @Bean
    CustomerRepo customerRepo() {
        System.out.println("useFakeCustomerRepo: " + useFakeCustomerRepo);

        return new CustomerFakeRepository();
    }

}






