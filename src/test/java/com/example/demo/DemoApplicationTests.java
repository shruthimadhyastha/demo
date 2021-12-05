package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private DemoApplication demoApplication;

	@Test
	public void TestSayHello(){
		String str1 = "World";
		String str2 = demoApplication.sayHello(str1);
		assertEquals("Hello World!", str2);
	}

}
