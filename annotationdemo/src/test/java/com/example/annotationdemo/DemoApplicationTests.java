package com.example.annotationdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Value("${foo}")
	int x;

	@Test
	void contextLoads() {
		System.out.println(x);
	}
}
