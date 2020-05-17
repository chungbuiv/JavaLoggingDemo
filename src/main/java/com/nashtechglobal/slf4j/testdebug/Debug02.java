package com.nashtechglobal.slf4j.testdebug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Debug02 {

	// Creating the Logger object
	private static final Logger logger = LoggerFactory.getLogger(Debug02.class);

	public static void writeLog() {
		logger.error("This is error message.");
		logger.warn("This is warn message");
		logger.info("This is info message");
		logger.debug("This is debug message");
		logger.trace("This is trace message");
	}
}
