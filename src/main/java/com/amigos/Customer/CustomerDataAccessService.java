package com.amigos.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDataAccessService implements  CustomerDao{

    private static List<Customer> customers;

    static {
        customers=new ArrayList<>();
        Customer alex= new Customer(
                1,
                "Alex",
                "alex@gmail.com",
                21
        );

        customers.add(alex);
        Customer jamila= new Customer(
                1,
                "jam",
                "jam@gmail.com",
                21
        );
        customers.add(jamila);


    }
    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id){
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
}
}
