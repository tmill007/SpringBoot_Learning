package com.amigoscode.Customer;

import com.amigoscode.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public List<Customer> getAllCustomers(){
        return customerDAO.getAllCustomers();
    }

    public Customer getCustomerById(Integer Id){
        return customerDAO.getCustomerById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer with ID [%s] not found".formatted(Id)));
    }
}
