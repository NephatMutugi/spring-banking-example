package com.kcbgroup.main.views;

import com.kcbgroup.main.models.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
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


    // TODO FINISH UP ON PUT MAPPING!!!
    public String updateCustomer(Customer customer) {

        boolean isPresent = false;
        for (Customer currentCustomer : customerList){
            if (currentCustomer.getCID() == customer.getCID()){
                isPresent = true;
                currentCustomer.setCID(customer.getCID());
                currentCustomer.setAddress(customer.getAddress());
                currentCustomer.setFirst_name(customer.getFirst_name());
                currentCustomer.setLast_name(customer.getLast_name());
                currentCustomer.setKra_pin(customer.getKra_pin());
            }
        }

        if (!isPresent){
            customerList.add(customer);
            return "Customer updated successfully";
        }

        return "Customer updated successfully";
    }
}
