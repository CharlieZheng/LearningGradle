package com.cndatacom.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainServiceTest {
	private MessageService messageService;
	
	@Before
	public void setUp() {
		messageService = new MessageService();
	}
	
	@Test
	public void getMessage_ShouldReturnMessage() {
		assertEquals("Hello World!", messageService.getMessage());
	}
	
}
