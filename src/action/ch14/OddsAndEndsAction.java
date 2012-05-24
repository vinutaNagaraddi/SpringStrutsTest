package action.ch14;

import service.OddsAndEndsService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class OddsAndEndsAction extends ActionSupport{
	private OddsAndEndsService oddsAndEndsService;
	
	public OddsAndEndsService getOddsAndEndsService() {
		return oddsAndEndsService;
	}

	public void setOddsAndEndsService(OddsAndEndsService oddsAndEndsService) {
		this.oddsAndEndsService = oddsAndEndsService;
	}

	public String execute(){
		this.oddsAndEndsService.sendEmail();
		return SUCCESS;
	}
	
	public String testJNDI(){
		this.oddsAndEndsService.testJNDI();
		return SUCCESS;
	}
}
