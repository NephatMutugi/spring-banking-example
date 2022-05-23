package com.kcbgroup.main.repos;

import com.kcbgroup.main.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
