package service;

import org.apache.log4j.Logger;

public class HelloMessageServiceImpl implements HelloMessageService{

	private Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		logger.debug("HELLO " + name + "  !!!!!");
	}

}
