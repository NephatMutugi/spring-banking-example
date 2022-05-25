package com.kcbgroup.main;

import com.kcbgroup.main.repos.CustomerJDBCDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KcbBankingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcbBankingExampleApplication.class, args);
	}

}
