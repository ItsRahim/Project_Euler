package Jobs;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Job {

	private ListOfTasks contains;
	private final int jobID;
	private String deadline;
	private int expectedTime;
	private String status;
	private int priority;
	private final String startDate;
	private String specialInstruction;

	/**
	 * 
	 * @param deadline
	 * @param priority
	 * @param jobID
	 */
	public Job(String deadline, int priority, int jobID, String specialInstruction) {
		this.deadline = deadline;
		this.priority = priority;
		this.jobID = jobID;
		status = "Initialised";
		LocalDate date = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		startDate = date.format(format);
		this.specialInstruction = specialInstruction;
	}


	/**
	 * 
	 * @param taskID
	 */
	public void addTask(int taskID) throws SQLException {
		contains.addTaskID(taskID);
	}

	/**
	 * 
	 * @param taskID
	 */
	public void removeTask(int taskID) {
		contains.removeTask(taskID);
	}

	/**
	 * 
	 * @param taskID
	 */
	public int retrieveTask(int taskID) {
		return taskID;
	}

	/**
	 * 
	 * @param taskStatus
	 */
	public void updateTask(String taskStatus) {

	}

	public int getJobID() {
		return this.jobID;
	}

	public int getExpectedTime() {
		return this.expectedTime;
	}

	/**
	 * 
	 * @param expectedTime
	 */
	public void setExpectedTime(int expectedTime) {
		this.expectedTime = expectedTime;
	}

	/**
	 * 
	 * @param status
	 */
	public void updateStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getDeadline() {
		return this.deadline;
	}

	/**
	 * 
	 * @param deadline
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public int getPriority() {
		return this.priority;
	}

	/**
	 * 
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStartDate() {
		return this.startDate;
	}


	public String getSpecialInstruction() {
		return this.specialInstruction;
	}

	/**
	 * 
	 * @param specialInstruction
	 */
	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

}