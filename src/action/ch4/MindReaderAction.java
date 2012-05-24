package action.ch4;

import service.MindReaderService;

import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class MindReaderAction extends ActionSupport{
	private MindReaderService mindreaderService;

	public MindReaderService getMindreaderService() {
		return mindreaderService;
	}

	public void setMindreaderService(MindReaderService mindreaderService) {
		this.mindreaderService = mindreaderService;
	}
	
	public String execute(){
		this.mindreaderService.mindReaderReadsThinkersThoughts();
		return SUCCESS;
	}
}
