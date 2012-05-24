package action.ch1;

import org.apache.log4j.Logger;

public class PoeticJuggler implements Performer{
	private Poem poem;
	private int beanBags;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public PoeticJuggler(int beanBags, Poem poem){
		this.beanBags = beanBags;
		this.poem = poem;
	}
	
	public PoeticJuggler(Poem poem){
		this.beanBags = 1;
		this.poem = poem;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		logger.debug("While juggling " + this.beanBags + " beanbag(s), he is singing....");
		poem.recite();
	}
	
	public void turnOnLights(){
		logger.debug("Lights ON!!!");
	}
	
	public void turnOffLights(){
		logger.debug("Lights Off!!!");
	}
}
