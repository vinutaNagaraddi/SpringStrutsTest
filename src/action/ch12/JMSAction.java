package action.ch12;

import service.AlertService;
import service.RPCJMSService;

import com.opensymphony.xwork2.ActionSupport;

import domain.Person;

@SuppressWarnings("serial")
public class JMSAction extends ActionSupport{
	
	private AlertService alertService;
	private RPCJMSService rpcJMSService;
	
	public RPCJMSService getRpcJMSService() {
		return rpcJMSService;
	}


	public void setRpcJMSService(RPCJMSService rpcJMSService) {
		this.rpcJMSService = rpcJMSService;
	}


	public AlertService getAlertService() {
		return alertService;
	}


	public void setAlertService(AlertService alertService) {
		this.alertService = alertService;
	}

	public String execute(){
		Person person = new Person(3,"Kollipara", "Vani", "Elizabethtown");
		alertService.sendPersonAlert(person);
		return SUCCESS;
	}
	
	public String rpcJmsService(){
		Person person = new Person(4,"Kollipara", "Vikram", "Colleyville");
		rpcJMSService.sendPersonAlert(person);
		return SUCCESS;
	}
}
