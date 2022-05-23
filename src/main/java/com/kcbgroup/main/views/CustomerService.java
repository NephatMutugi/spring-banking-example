package com.kcbgroup.main.views;

import com.kcbgroup.main.models.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerService {
    private static final List<Customer> customerList = new ArrayList<>();

    // Find all customers
    public List<Customer> findAll(){
        return customerList;
    }

    // Find one customer
    public Customer findOne(int id){
        for (Customer c : customerList){
            if (c.getCID() == id)
                return c;
        }

        return null;
    }

    // Delete a customer
    public Customer deleteByID(int id){
        Iterator<Customer> iterator = customerList.iterator();
        Customer customer = iterator.next();
        while (iterator.hasNext()){
            if (customer.getCID() == id){
                iterator.remove();
            }
        }

        return customer;
    }

}
