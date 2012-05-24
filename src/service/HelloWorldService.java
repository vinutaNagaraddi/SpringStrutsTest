package service;

import org.apache.log4j.Logger;

public class HelloWorldService {
	
	private String message;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void test() {
		// TODO Auto-generated method stub
		logger.debug("In HelloWorldService test()   " + message);
	}

}
