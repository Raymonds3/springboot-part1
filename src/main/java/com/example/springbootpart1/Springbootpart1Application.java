package com.example.springbootpart1;

import com.example.springbootpart1.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.graalvm.compiler.nodeinfo.Verbosity.Name;

@SpringBootApplication
public class Springbootpart1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springbootpart1Application.class, args);
	}

	@Autowired
	private UserServiceImpl userServiceImpl;

	public void run(String... args){

		try {
			userServiceImpl.addUser(5, "Simcar", "Mahlangu"); //Prints the added user on a console
			userServiceImpl.getUser(5); //Prints a selected user name and surname on a console
			userServiceImpl.removeUser(4); //Prints a removed user name and surname on a console
		}catch (Exception e){
			e.getStackTrace();
		}
	}
}
