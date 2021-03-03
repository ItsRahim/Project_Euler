package baper;

import dbConnector.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the system!");
        Jobs.ListOfTaskDetails TObject = new Jobs.ListOfTaskDetails();
        dbConnector dbObject = new dbConnector();

        dbObject.connect();
    }
}
