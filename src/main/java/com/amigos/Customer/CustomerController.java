package com.amigos.Customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {
 private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(path = "/api/v1/customer",method = RequestMethod.GET)
    public  List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping( "/api/v1/customers/{customerId")
    public  Customer getCustomerById(@PathVariable("customerId") Integer customerId) {
        return customerService.getCustomerById(customerId);
    }


}
