package service;

import org.apache.log4j.Logger;

import domain.Person;

public class RPCJMSServiceImpl implements RPCJMSService {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void sendPersonAlert(final Person person) {
		// TODO Auto-generated method stub
		logger.debug(person);
	}

}
