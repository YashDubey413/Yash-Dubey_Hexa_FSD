package com.hexaware.cricketteammanagement.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayerNotFoundException extends Exception{

	Logger logger=LoggerFactory.getLogger(PlayerNotFoundException.class);
	
	public PlayerNotFoundException(String msg) {
		super(msg);
		logger.error("No Such Player in database!!");
	}
}
