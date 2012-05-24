package action.ch1;

import org.apache.log4j.Logger;

public class Sonnet29 implements Poem{

	private Logger logger = Logger.getLogger(this.getClass());
	
	private static String[] LINES ={
		"this is in sonnet 29",
		"blah blah blah"
		};
	
	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for (String s: LINES){
			logger.debug(s);
		}	
	}

}
