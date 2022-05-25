package com.kcbgroup.main.jpa;

import com.kcbgroup.main.models.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CustomerJpaRepo {
    /* TODO: Transactions should be moved to the business services level
         and not repository level*/

    // Connect to the database
    // Entity manager manages the entities.
    @PersistenceContext
    EntityManager entityManager;

    public Customer findById(int id){
        return entityManager.find(Customer.class, id);
    }
}
