package com.example.springbootpart1;

import com.example.springbootpart1.services.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Springbootpart1ApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void addUser() {
		assertThat(this.userService.addUser(5, "Simcar", "Mahlangu"))
				.contains("Simcar Mahlangu was Entered");
//		assertThat(this.userService.addUser(5, "Simcar", "Mahlangu")
//				.contains("Simcar Mahla was Entered"));
	}

}
