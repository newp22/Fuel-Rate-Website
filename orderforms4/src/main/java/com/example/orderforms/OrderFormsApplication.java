package com.example.orderforms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderforms.dao.friend.*;
@SpringBootApplication
@RestController
public class OrderFormsApplication {
    private static final Logger log = LoggerFactory.getLogger(OrderFormsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderFormsApplication.class, args);


    }
    
    /*@Bean
    public CommandLineRunner demo(FriendRepository friendRepository) {
        return (args) -> {



           /* // save a few customers
            friendRepository.save(new Friend("Jack", "Bauer", "Bauer"));
            friendRepository.save(new Friend("Chloe", "O'Brian", "No'brian"));
            friendRepository.save(new Friend("Kim", "Saur", "Saur"));z

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Friend Friend : friendRepository.findAll()) {
                log.info(Friend.toString());
            }
            log.info("");

            // fetch an individual Friend by ID
            Friend Friend = friendRepository.findFriendById(1);
            log.info("Friend found with findById(1L):");
            log.info("--------------------------------");
            log.info(Friend.toString());
            log.info("");

            // fetch customers by last name
            log.info("Friend found with findByUser('Bauer'):");
            log.info("--------------------------------------------");
            friendRepository.findByUser("Jack").forEach(jack -> {
                log.info(jack.toString());
            });
            // for (Friend bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }*/


}
