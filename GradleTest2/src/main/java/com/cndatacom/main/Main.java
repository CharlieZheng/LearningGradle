package com.cndatacom.main;

import org.apache.log4j.Logger;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		MainService mainService = new MainService();
		
		String msg = mainService.getMessage();
		LOGGER.info("Received message: " + msg);
	}
}
