package action;


import org.apache.log4j.Logger;

import service.HelloWorldService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWorldAction extends ActionSupport {
	private Logger logger = Logger.getLogger(this.getClass());
	private HelloWorldService helloWorldService;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldService getHelloWorldService() {
		return helloWorldService;
	}

	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public String execute(){
		logger.debug("Hello Vinuta  "  + message);
		this.helloWorldService.test();
		return SUCCESS;
	}
	
	public String startApp(){
		return SUCCESS;
	}
	
}
