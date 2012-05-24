package action.ch2;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import action.ch1.Instrument;

@Component
public class Instrumentalist implements Instrument{

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		logger.debug("Instrumentalist is playing his instrument");
	}

}
