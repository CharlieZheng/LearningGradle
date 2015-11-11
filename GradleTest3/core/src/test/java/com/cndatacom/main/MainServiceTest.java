package com.cndatacom.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainServiceTest {
	private MainService mainService;
	
	@Before
	public void setUp() {
		mainService = new MainService();
	}
	
	@Test
	public void getMessage_ShouldReturnMessage() {
		assertEquals("Hello World!", mainService.getMessage());
	}
	
}
