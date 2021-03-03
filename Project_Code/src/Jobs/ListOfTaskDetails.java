package Jobs;

import java.sql.SQLException;
import java.util.ArrayList;

public class ListOfTaskDetails
{
   private int numberofTasks;
   TaskDetails TObject = new TaskDetails();
   public ArrayList<Jobs.TaskDetails> tasks = new ArrayList<Jobs.TaskDetails>();

   public ListOfTaskDetails()
   {
      tasks.add(new TaskDetails("Use of large copy camera", "Copy Room", 19.00, 120, 1));
      TObject.writeTask("Use of large copy camera", "Copy Room", 19.00, 120);

      tasks.add(new TaskDetails("Black and white film processing", "Development area", 49.50, 60, 2));
      TObject.writeTask("Black and white film processing", "Development area", 49.50, 60);

      tasks.add(new TaskDetails("Bag up", "Packing Departments", 6.00, 30, 3));
      TObject.writeTask("Bag up", "Packing Departments", 6.00, 30);

      tasks.add(new TaskDetails("Colour film processing", "Development Area", 80.00, 90, 4));
      TObject.writeTask("Colour film processing", "Development Area", 80.00, 90);

      tasks.add(new TaskDetails("Colour Transparency processing", "Development Area", 110.30, 180, 5));
      TObject.writeTask("Colour Transparency processing", "Development Area", 110.30, 180);

      tasks.add(new TaskDetails("Use of small copy camera", "Copy Room", 8.30, 75, 6));
      TObject.writeTask("Use of small copy camera", "Copy Room", 8.30, 75);

      tasks.add(new TaskDetails("Mount Transparencies", "Finishing Room", 55.50, 45, 7));
      TObject.writeTask("Mount Transparencies", "Finishing Room", 55.50, 45);
   }

   public ArrayList<TaskDetails> getTasks()
   {
      return tasks;
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
   public void removeTask(int taskID)
   {
      // TODO - implement ListOfTasks.removeTask
      throw new UnsupportedOperationException();
   }

   /**
    *
    * @param taskStatus
    */
   public void updateTask(String taskStatus)
   {
      // TODO - implement ListOfTasks.updateTask
      throw new UnsupportedOperationException();
   }

   /**
    *
    * @param taskID
    */
   public TaskDetails retrieveTask(int taskID)
   {
      // TODO - implement ListOfTasks.retrieveTask
      throw new UnsupportedOperationException();
   }

}