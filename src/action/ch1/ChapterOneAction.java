package action.ch1;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import action.ch2.Instrumentalist;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ChapterOneAction extends ActionSupport{
	
	private Performer performer;
	private Performer oneManBand;
	
	@Autowired
	private Instrumentalist instrumentalist;
	private boolean oneManBandHasInstrumentsList;
	private boolean oneManBandHasInstrumentsMap;
	private Instrument chosenInstrument;
	private Instrument firstInstrument;
	private Instrument lastInstument;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	
	public Instrumentalist getInstrumentalist() {
		return instrumentalist;
	}

	public void setInstrumentalist(Instrumentalist instrumentalist) {
		this.instrumentalist = instrumentalist;
	}

	public Instrument getFirstInstrument() {
		return firstInstrument;
	}

	public void setFirstInstrument(Instrument firstInstrument) {
		this.firstInstrument = firstInstrument;
	}

	public Instrument getLastInstument() {
		return lastInstument;
	}

	public void setLastInstument(Instrument lastInstument) {
		this.lastInstument = lastInstument;
	}

	public Instrument getChosenInstrument() {
		return chosenInstrument;
	}

	public void setChosenInstrument(Instrument chosenInstrument) {
		this.chosenInstrument = chosenInstrument;
	}

	public boolean isOneManBandHasInstrumentsList() {
		return oneManBandHasInstrumentsList;
	}

	public void setOneManBandHasInstrumentsList(boolean oneManBandHasInstrumentsList) {
		this.oneManBandHasInstrumentsList = oneManBandHasInstrumentsList;
	}

	public boolean isOneManBandHasInstrumentsMap() {
		return oneManBandHasInstrumentsMap;
	}

	public void setOneManBandHasInstrumentsMap(boolean oneManBandHasInstrumentsMap) {
		this.oneManBandHasInstrumentsMap = oneManBandHasInstrumentsMap;
	}

	public Performer getOneManBand() {
		return oneManBand;
	}

	public void setOneManBand(Performer oneManBand) {
		this.oneManBand = oneManBand;
	}

	public Performer getPerformer() {
		return performer;
	}

	public void setPerformer(Performer performer) {
		this.performer = performer;
	}

	public String execute(){
		this.performer.perform();
		//logger.debug("oneManBandHasInstrumentsList " + this.oneManBandHasInstrumentsList);
		//logger.debug("oneManBandHasInstrumentsMap " + this.oneManBandHasInstrumentsMap);
		logger.debug("choosen Instrument... ");
		this.chosenInstrument.play();
		this.oneManBand.perform();
		this.instrumentalist.play();
		return SUCCESS;
	}
}
