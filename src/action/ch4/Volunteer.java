package action.ch4;

public class Volunteer implements Thinker{
	private String thoughts;
	private Integer number;

	@Override
	public void thinkOfSomething(String thoughts) {
		// TODO Auto-generated method stub
		this.thoughts = thoughts;
	}
	
	@Override
	public void setSecretNumber(Integer number) {
		// TODO Auto-generated method stub
		this.number = number;
	}
}
