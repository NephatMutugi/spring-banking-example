package com.kcbgroup.main.jpa;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CustomerJpaRepo {

    /* TODO: Transactions should be moved to the business services level
         and not repository level*/


}
