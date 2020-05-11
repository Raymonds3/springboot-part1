package com.example.springbootpart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootpart1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootpart1Application.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {//arrow function or lamddas
//			System.out.println("Lets inspect Beans");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//
//			for(String beanName : beanNames){
//				System.out.println(beanName);
//			}
//		};
//	}

}
