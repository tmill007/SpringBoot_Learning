package com.amigoscode.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Integer Id);
}
