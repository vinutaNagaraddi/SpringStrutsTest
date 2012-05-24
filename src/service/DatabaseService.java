package service;

import org.springframework.transaction.support.TransactionTemplate;

import action.ch5.PersonDAO;
import domain.Person;

public interface DatabaseService {
	void setTransactionTemplate(TransactionTemplate transactionTemplate);
	TransactionTemplate getTransactionTemplate();
	PersonDAO getPersonDAO();
	void setPersonDAO(PersonDAO personDAO);
	void addPerson(Person person);
	Person getPerson(final Integer personId);
	void updatePerson(Person person);
}
