package action.ch4;

import org.apache.log4j.Logger;

public class PoeticAudience {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public void takeSeats(){
		logger.debug("wait for the poem to be read");
	}
	
	public void showOver(){
		logger.debug("Applaud for the person who read the poem");
	}
}
