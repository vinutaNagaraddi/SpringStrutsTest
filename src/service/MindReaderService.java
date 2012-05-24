package service;

import org.apache.log4j.Logger;

import action.ch4.MindReader;
import action.ch4.Thinker;

public class MindReaderService {
	private MindReader mindReader;
	private Thinker thinker;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public MindReader getMindReader() {
		return mindReader;
	}
	public void setMindReader(MindReader mindReader) {
		this.mindReader = mindReader;
	}
	public Thinker getThinker() {
		return thinker;
	}
	public void setThinker(Thinker thinker) {
		this.thinker = thinker;
	}
	
	public void mindReaderReadsThinkersThoughts(){
		thinker.thinkOfSomething("this is crazy..can the magician really know what" +
				" i am thinking?");
		logger.debug("Magician : " + mindReader.getThoughts());
		
		thinker.setSecretNumber(4);
		logger.debug("Magician : " + mindReader.getNumber());
	}
}
