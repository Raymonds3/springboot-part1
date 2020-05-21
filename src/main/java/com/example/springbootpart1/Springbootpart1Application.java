package com.example.springbootpart1;

import com.example.springbootpart1.model.User;
import com.example.springbootpart1.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.graalvm.compiler.nodeinfo.Verbosity.Name;

@SpringBootApplication
public class Springbootpart1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootpart1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserServiceImpl user){
		return (args) ->{
			String user0 = user.addUser(5, "Simcar", "Mahlangu");
			System.out.println("User added with addUser(5, \"Simcar\", \"Mahlangu\"):");
			System.out.println("--------------------------------");
			System.out.println(user0);
			System.out.println();


			String user1 = user.getUser(1);
			System.out.println("User found with getUser(1):");
			System.out.println("--------------------------------");
			System.out.println(user1);
			System.out.println();

			String user2 = user.removeUser(3);
			System.out.println("User deleted with remove(3):");
			System.out.println("--------------------------------");
			System.out.println(user2);
			System.out.println();
		};
	}
}
