package com.kcbgroup.main.jpa;

import com.kcbgroup.main.models.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

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

    public Customer updateCustomer(Customer customer){
        return entityManager.merge(customer);
    }

    public Customer insertCustomer(Customer customer){
        return entityManager.merge(customer);
    }

    public void deleteCustomer(int id){
        Customer customer = findById(id);
        entityManager.remove(customer);
    }

    public List<Customer> findAll(){
        TypedQuery<Customer> findCustomers =
                entityManager.createNamedQuery("findAllCustomers", Customer.class);
        return findCustomers.getResultList();
    }
}
