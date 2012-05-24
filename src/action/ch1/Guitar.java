package action.ch1;

import org.apache.log4j.Logger;

import annotation.StringedInstrument;

@StringedInstrument
public class Guitar implements Instrument{
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		logger.debug("playing the guitar");
	}

}
