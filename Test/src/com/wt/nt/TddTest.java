package com.wt.nt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TddTest {

	@Test
	void test() {
		assertEquals("Fizz", "Fizz");
		assertEquals("Buzz", "Buzz");
		assertEquals("FizzBuzz", "FizzBuzz");
	
		assertNotNull("Fizz","Fizz");
	}

}
