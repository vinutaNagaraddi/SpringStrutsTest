package action.ch4;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Pointcut("execution (* action.ch1.ChapterOneAction.execute())")
	public void performance(){}
	
	@Before("performance()")
	public void takeSeats(){
		logger.debug("The audience is taking their seats...");
	}
	
	@Before("performance()")
	public void turnOffCellPhones(){
		logger.debug("The audience is turning off their cellphones");
	}
	
	@After("performance()")
	public void showOver(){
		logger.debug("Show Over!!!");
	}
	
	@AfterReturning("performance()")
	public void applaud(){
		logger.debug("CLAP CLAP");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund(){
		logger.debug("Boo!  We want our money");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		long start = System.currentTimeMillis();
		
		try {
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			
			logger.debug("The performance took  " + (end - start)  + " milliseconds");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
