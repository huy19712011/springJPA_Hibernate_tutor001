package com.example.spring_jpa_hibernate.tutor001;

import com.example.spring_jpa_hibernate.tutor001.entity.Person;
import com.example.spring_jpa_hibernate.tutor001.jdbc.PersonJdbcDao;
import com.example.spring_jpa_hibernate.tutor001.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		System.out.println("Setting up ... Ok!!!");
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 1: -> {}", repository.findById(1));

		logger.info("Inserting 100 -> {}", repository.insert(new Person("name100", "location100", new Date())));

//		logger.info("Updating 2 -> {}", repository.update(repository.findById(2)));
		logger.info("Updating 2 -> {}", repository.update(new Person("newName", "newLocation", new Date())));

//		repository.deleteById(2); // only for testing

		logger.info("All users -> {}", repository.findAll());

	}
}
