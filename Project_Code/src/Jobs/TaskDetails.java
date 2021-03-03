package Jobs;

import dbConnector.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskDetails
{
	private int taskID;
	private String description;
	private String location;
	private double price;
	private int duration;

	dbConnector dbObject = new dbConnector();

	/**
	 *
	 * @param description
	 * @param location
	 * @param price
	 * @param duration
	 */

	public TaskDetails(String description, String location, double price, int duration, int ID)
	{}

	public TaskDetails()
	{}

	public void writeTask(String description, String location, double price, int duration)
	{
		try{
			Statement stmt = dbObject.connect().createStatement();
			// checking to see if task already exists in DB
			String SQL = "SELECT * FROM Test WHERE Task_Description='" + description + "'";
			ResultSet rs = stmt.executeQuery(SQL);
			if (rs.next())
			{
				System.out.println(description + " Already Exists");
			}else{
				String query = "INSERT INTO Test (Task_Description, Location, Price, Duration)" + " VALUES (?, ?, ?, ?)";
				PreparedStatement preparedStmt = dbObject.connect().prepareStatement(query);
				// inserting data into DB
				preparedStmt.setString (1, description);
				preparedStmt.setString (2, location);
				preparedStmt.setDouble (3, price);
				preparedStmt.setInt (4, duration);

				int rows = preparedStmt.executeUpdate();
				// check to see if data was inserted successfully
				if (rows > 0)
				{
					System.out.println(description + " Has been successfully inserted");
				}
				preparedStmt.close();
			}
			}catch (Exception e){
				System.out.println("ERROR: " + e.getMessage());
			}
	}

	public int getTaskID() {
		return this.taskID;
	}

	/**
	 * 
	 * @param taskID
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return this.location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return this.duration;
	}

	/**
	 * 
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
}