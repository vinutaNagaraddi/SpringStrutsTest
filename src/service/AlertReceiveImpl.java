package service;


import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;

import action.ch5.PersonDAO;

import domain.Person;

public class AlertReceiveImpl implements AlertReceive{
	
	private PersonDAO personDAO;
	private Logger logger = Logger.getLogger(this.getClass());
	
	
	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public void getAlert(Person person){
		logger.debug("adding " + person);
		personDAO.addPerson(person);
	}
}
