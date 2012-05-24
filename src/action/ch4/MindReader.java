package action.ch4;

public interface MindReader {
	void interceptThoughts(String thoughts);
	void interceptNumber(Integer number);
	String getThoughts();
	Integer getNumber();
}
