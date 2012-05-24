package action.ch1;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.inject.Inject;

import annotation.StringedInstrument;

public class OneManBand implements Performer {

	private List<Instrument> listOfInstruments;
	private Map<String,Instrument>  mapOfInstruments;
	private Logger logger = Logger.getLogger(this.getClass());
	private Instrument autoWireInstrument;
	private Instrument favoriteInstrument;
	
	@Inject
	private Instrument leastFavoriteInstrument;
	
	public Instrument getLeastFavoriteInstrument() {
		return leastFavoriteInstrument;
	}

	public void setLeastFavoriteInstrument(Instrument leastFavoriteInstrument) {
		this.leastFavoriteInstrument = leastFavoriteInstrument;
	}

	public Instrument getFavoriteInstrument() {
		return favoriteInstrument;
	}

	@Autowired
	@StringedInstrument
	public void setFavoriteInstrument(Instrument favoriteInstrument) {
		this.favoriteInstrument = favoriteInstrument;
	}

	public Instrument getAutoWireInstrument() {
		return autoWireInstrument;
	}

	public void setAutoWireInstrument(Instrument autoWireInstrument) {
		this.autoWireInstrument = autoWireInstrument;
	}

	public List<Instrument> getListOfInstruments() {
		return listOfInstruments;
	}

	public void setListOfInstruments(List<Instrument> listOfInstruments) {
		this.listOfInstruments = listOfInstruments;
	}

	public Map<String, Instrument> getMapOfInstruments() {
		return mapOfInstruments;
	}

	public void setMapOfInstruments(Map<String, Instrument> mapOfInstruments) {
		this.mapOfInstruments = mapOfInstruments;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		logger.debug("One Man Band is performing....");
		logger.debug("list of instruments");
		
		for(Instrument in: listOfInstruments){
			in.play();
		}
		
		logger.debug("map of instruments");
		if (mapOfInstruments != null){
			Set<String> keys = mapOfInstruments.keySet();
			for (String key: keys){
				logger.debug("KEY:" + key);
				mapOfInstruments.get(key).play();
			}
				
		}
		
		logger.debug("autoWireInstrument... ");
		autoWireInstrument.play();
		
		logger.debug("favoriteInstrument... ");
		favoriteInstrument.play();
		
		logger.debug("leastFavoriteInstrument... ");
		leastFavoriteInstrument.play();
	}
}