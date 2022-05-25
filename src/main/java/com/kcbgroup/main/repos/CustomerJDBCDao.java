package com.kcbgroup.main.repos;

import com.kcbgroup.main.models.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/** @Author Nephat Mutugi
 * Simple Repository to test usage of JDBC instead of JPA */

@Repository
public class CustomerJDBCDao {

    JdbcTemplate jdbcTemplate;


    public CustomerJDBCDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Customer> findAll(){
        return jdbcTemplate.query("SELECT * FROM customer",
                new BeanPropertyRowMapper<>(Customer.class));
    }
}
