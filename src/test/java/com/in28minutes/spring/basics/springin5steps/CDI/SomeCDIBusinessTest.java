package com.in28minutes.spring.basics.springin5steps.CDI;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {
	@InjectMocks
	SomeCDIBusiness business;

	@Mock
	SomeCDIDAO daoMock;

	@Test
	public void test() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 45, 48, 49 });
		int result = business.findGreatest();
		assertEquals(49, result);
	}

	@Test
	public void test2() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { -45, -48, -49 });
		int result = business.findGreatest();
		assertEquals(-45, result);
	}

	@Test
	public void test3() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 100, -48, 49 });
		int result = business.findGreatest();
		assertEquals(100, result);
	}
}
