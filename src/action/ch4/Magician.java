package action.ch4;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader{

	private String thoughts;

	private Integer number;
	
	@Pointcut("execution( * action.ch4.Thinker.thinkOfSomething(String)) && args(thoughts)")
	public void thinking(String thoughts){}
	
	@Pointcut("execution( * action.ch4.Thinker.setSecretNumber(Integer)) && args(number)")
	public void thinkingOfNumber(Integer number){}
	
	
	@Before("thinking(thoughts)")
	@Override
	public void interceptThoughts(String thoughts) {
		// TODO Auto-generated method stub
		this.thoughts = thoughts;
	}

	@Override
	public Integer getNumber(){
		return this.number;
	}
	
	@Override
	public String getThoughts() {
		// TODO Auto-generated method stub
		return thoughts;
	}

	@Before("thinkingOfNumber(number)")
	@Override
	public void interceptNumber(Integer number) {
		// TODO Auto-generated method stub
		this.number = number;
	}

}
