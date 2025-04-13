package com.amigoscode.Customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDAO{
    private static final List<Customer> customers;

    //mock DB
    static {
        customers = new ArrayList<>();
        Customer tony = new Customer(1, "Tony", "tmill@gmail.com", 43);
        customers.add(tony);
        Customer ronique = new Customer(2, "Ronique", "rrob@yahoo.com", 41);
        customers.add(ronique);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> getCustomerById(Integer Id) {
        return customers.stream()
                        .filter(customer -> customer.getId().equals(Id))
                        .findFirst();
    }
}
