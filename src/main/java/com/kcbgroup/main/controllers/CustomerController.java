package com.kcbgroup.main.controllers;

import com.kcbgroup.main.exceptions.UserNotFoundException;
import com.kcbgroup.main.models.Customer;
import com.kcbgroup.main.repos.CustomerRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    private final CustomerRepository customerRepository;


    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers/")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }

    // Add a customer
    @PostMapping(value = "/customers/", consumes = "application/json")
    public ResponseEntity<Object> addCustomer(@Valid @RequestBody Customer customer){
        Customer savedCustomer = customerRepository.save(customer);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(savedCustomer.getCID())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    // Return one customer
    @GetMapping("/customers/{id}")
    public EntityModel<Customer> returnCustomer(@PathVariable int id){
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent()){
            throw new UserNotFoundException("id -> " + id);
        }

        EntityModel<Customer> entityModel = EntityModel.of(customer.get());
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass())
                        .customerList());
                entityModel.add(linkBuilder.withRel("all-customers"));
        return entityModel;
    }

    // Update Customer
    //TODO Finalize on put mapping
    @PutMapping("/customers/")
    public Customer updateCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return customer;
    }

}
