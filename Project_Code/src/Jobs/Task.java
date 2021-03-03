package Jobs;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task{

	private String status;
	private String date;
	private int timeTaken; // Field when complete Task
	private int startTime;
	private int jobTaskID;
	private int taskID;
	private Job job;
	private TaskDetails details;
	private String shift;

	public void setJob(Job job) {
		this.job = job;
	}

	public Task(int ID) throws SQLException {
		status = "Initialised";
		this.taskID = ID;
		ListOfTaskDetails list = new ListOfTaskDetails();
		// jobTaskID = job.getJobID() + getTaskID();
		for (TaskDetails t : list.getTasks()){
			if (t.getTaskID() == taskID)
				details = t;
		}

	}

	public void start(String shift) {
		LocalDate dateObj = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		date = dateObj.format(format);
		setStatus("Processing");
		this.shift = shift;
	}

	public void complete() {
		setStatus("Complete");
	}

	public String getStatus() {
		return this.status;
	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return this.date;
	}


	public int getTimeTaken() {
		return this.timeTaken;
	}

	/**
	 * 
	 * @param timeTaken
	 */
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	public int getStartTime() {
		return this.startTime;
	}

	/**
	 * 
	 * @param startTime
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getTaskID() {
		// TODO - implement Task.getTaskID
		throw new UnsupportedOperationException();
	}

}