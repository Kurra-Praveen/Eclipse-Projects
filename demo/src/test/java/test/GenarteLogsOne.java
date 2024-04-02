package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
;

public class GenarteLogsOne {
	
	private static Logger log = LogManager.getLogger(GenarteLogsOne.class.getName());
	
	public static void main(String[] args) {
		
		
		log.debug("clicked");
		
		log.debug("Joined");
		
		log.debug("Passed");
		
		log.debug("Setup");
	}


}
