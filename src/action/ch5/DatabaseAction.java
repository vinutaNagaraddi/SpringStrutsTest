package action.ch5;

import org.apache.log4j.Logger;

import service.DatabaseService;


import com.opensymphony.xwork2.ActionSupport;

import domain.Person;


@SuppressWarnings("serial")
public class DatabaseAction extends ActionSupport{
	private DatabaseService databaseService;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}

	public String addPerson(){
		Person person = new Person();
		person.setPersonID(1);
		person.setFirstName("Venkatesh");
		person.setLastName("Nagaraddi");
		person.setCity("Richardson");
		this.databaseService.addPerson(person);
		return SUCCESS;
	}
	
	public String getPerson(){
		Person person = this.databaseService.getPerson(1);
		logger.debug(person);
		return SUCCESS;
	}
	
	public String updatePerson(){
		Person person = new Person();
		person.setPersonID(1);
		person.setFirstName("Vinuta");
		person.setLastName("Nagaraddi");
		person.setCity("Plano");
		this.databaseService.updatePerson(person);
		return SUCCESS;
	}
	
}
