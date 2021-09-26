package com.javacode.userapp;

import com.javacode.userapp.dao.UserRepository;
import com.javacode.userapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendUserAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendUserAppApplication.class, args);
	}
@Autowired
UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		userRepo.save(new User("Shalini","HP","shalu@gmail.com"));
		userRepo.save(new User("John","Smith","john@gmail.com"));
		userRepo.save(new User("Harry","Potter","harry@gmail.com"));
		userRepo.save(new User("Jack","Mills","Jack@gmail.com"));
		userRepo.save(new User("James","Bond","James@gmail.com"));
	}
}
