package service;

import domain.Person;

public interface RPCJMSService {
	void sendPersonAlert(Person person);
}
