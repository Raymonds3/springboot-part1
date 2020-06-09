package com.example.springbootpart1;

import com.example.springbootpart1.services.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Springbootpart1ApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void addUser() {
		assertEquals("Simcar Mahlangu was Entered", userService.addUser(5,"Simcar", "Mahlangu"));
	}

	@Test
	public void getUser() {
		assertEquals("Hello Raymond Serekwane", userService.getUser(1));
	}

	@Test
	public void removeUser() {
		assertEquals("Tom Moyo was Deleted", userService.removeUser(3));
	}

}
