package action.ch4;

import org.apache.log4j.Logger;

public class GraciousContestant implements Contestant{

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void recieveAward() {
		// TODO Auto-generated method stub
		logger.debug("Thank you for the award");
	}

}
