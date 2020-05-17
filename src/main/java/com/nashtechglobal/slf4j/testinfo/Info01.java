package com.nashtechglobal.slf4j.testinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Info01 {

	// Creating the Logger object
	private static final Logger logger = LoggerFactory.getLogger(Info01.class);

	public static void writeLog() {
		logger.error("This is error message.");
		logger.warn("This is warn message");
		logger.info("This is info message");
		logger.debug("This is debug message");
		logger.trace("This is trace message");
	}
}
