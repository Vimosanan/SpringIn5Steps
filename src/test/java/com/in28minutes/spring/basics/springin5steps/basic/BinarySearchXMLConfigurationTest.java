package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations ="/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void test() {
		int result = binarySearch.binarySearch(new int[] { 1, 3, 4, 5 }, 3);
		assertEquals(3, result);
	}

}
