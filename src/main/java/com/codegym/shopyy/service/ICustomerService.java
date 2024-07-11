package com.codegym.shopyy.service;

import com.codegym.shopyy.model.Customer;
import com.codegym.shopyy.model.dto.RegistrationDto;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);

    void saveCustomer(RegistrationDto registrationDto);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer getCustomerByEmail(String email);

    Customer getCustomerByUsername(String username);
}
