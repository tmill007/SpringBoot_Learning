package com.amigoscode;

import com.amigoscode.Customer.Customer;
import com.amigoscode.Customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            Customer tony = new Customer("Tony", "tmill@gmail.com", 43);
            Customer ronique = new Customer("Ronique", "rrob@yahoo.com", 41);

            customerRepository.saveAll(List.of(tony, ronique));
        };
    }
}