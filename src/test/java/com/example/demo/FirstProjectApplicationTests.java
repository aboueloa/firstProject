package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjectApplicationTests {
	@Autowired
	private Alien a;
	@Test
	void contextLoads() {
	}
	@Test
	public void testShow() {
		String expected = "oki oki";
		String res = a.show();
		assertEquals(expected, res);
	}

}
