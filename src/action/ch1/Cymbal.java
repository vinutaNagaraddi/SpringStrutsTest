package action.ch1;

import org.apache.log4j.Logger;

public class Cymbal implements Instrument{
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		logger.debug("playing the cymbal");
	}

}
