package Report;

import java.security.Timestamp;

public abstract class Report {

	private Timestamp generationTime;

	public abstract void view();

	public abstract void generate();

	/**
	 * 
	 * @param generationTime
	 */
	public abstract void setGenerationTime(Timestamp generationTime);

	public abstract void getGenerationTime();

	public abstract void print();

}