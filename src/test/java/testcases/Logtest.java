package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

//import logs.LogTest;
public class Logtest {
public Logger log = LogManager.getLogger(Logtest.class.getName());
	@Test
	public void Print() {
		log.debug("i am from debug");
		log.error("i am from error");
		log.info("i am from info");
		log.fatal("i am from fatal===");
		System.out.println("we are done");
	}
}

