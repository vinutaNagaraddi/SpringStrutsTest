package action.ch5;

import domain.Person;

public interface PersonDAO {
	void addPerson(Person person);
	void updatePerson(Person person);
	Person getPersonById(Integer personID);
}
