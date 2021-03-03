package Jobs;

import java.sql.SQLException;

public class ListOfTasks {

	private int numberofTasks;

	public ListOfTasks() {
		// TODO - implement ListOfTasks.ListOfTasks
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public void addTaskID(int taskID) throws SQLException {
		Task t = new Task(taskID);
	}

	/**
	 * 
	 * @param taskID
	 */
	public void removeTask(int taskID) {
		// TODO - implement ListOfTasks.removeTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskStatus
	 */
	public void updateTask(String taskStatus) {
		// TODO - implement ListOfTasks.updateTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public Task retrieveTask(int taskID) {
		// TODO - implement ListOfTasks.retrieveTask
		throw new UnsupportedOperationException();
	}

}