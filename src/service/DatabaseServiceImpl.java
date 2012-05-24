package service;

import org.apache.log4j.Logger;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import domain.Person;

import action.ch5.PersonDAO;



public class DatabaseServiceImpl implements DatabaseService{

	private PersonDAO personDAO;
	private TransactionTemplate transactionTemplate;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	public void addPerson( Person person){
		personDAO.addPerson(person);
	}

	public Person getPerson(final Integer personId) {
		Person person =  personDAO.getPersonById(personId);
		return person;
	}

	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDAO.updatePerson(person);
	}
}
