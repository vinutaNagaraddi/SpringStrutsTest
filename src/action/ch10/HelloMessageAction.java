package action.ch10;

import java.rmi.registry.Registry;

import org.apache.log4j.Logger;

import service.HelloMessageService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloMessageAction extends ActionSupport {

	private HelloMessageService helloMessageService;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public HelloMessageService getHelloMessageService() {
		return helloMessageService;
	}

	public void setHelloMessageService(HelloMessageService helloMessageService) {
		this.helloMessageService = helloMessageService;
	}

	public String execute(){
		this.helloMessageService.sayHello("Vinuta Shivakumar Nagaraddi");
		return SUCCESS;
	}
}
