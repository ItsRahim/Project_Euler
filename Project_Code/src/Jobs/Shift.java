package Jobs;

public class Shift {

	private String startTime;
	private String endTime;
	private String name;

	/**
	 * 
	 * @param startTime
	 * @param endTime
	 * @param name
	 */
	public Shift(String startTime, String endTime, String name) {
		// TODO - implement Shift.Shift
		throw new UnsupportedOperationException();
	}

	public String getStartTime() {
		return this.startTime;
	}

	/**
	 * 
	 * @param startTime
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	/**
	 * 
	 * @param endTime
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}