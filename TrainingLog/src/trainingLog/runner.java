package trainingLog;

import java.util.ArrayList;
import java.util.Scanner;
public class runner 
    {
    	static Scanner userIntInput = new Scanner(System.in);
        static Scanner userStringInput = new Scanner(System.in);
    	static int distance = 0;
    	static String date = "";
    	static int time = 0;
    	static boolean working = true;
    	static ArrayList<log> runs = new ArrayList<log>();
    public static void main(String[] args) 
        {
       while(working = true) {
        work();
        fillLog();
        getLog();
       }
       if(working = false) {
    	   System.out.println("Have a good day!");
       }
        }
    
    public static void work()
    {
    	
       
        System.out.println("Enter the date of the run you want to log in MM/DD/YY format");
         date = userStringInput.nextLine();
        
         System.out.println("Enter the distance of your last run, round to the nearest mile (eg. 6.5 should be 7, 8.1 should be 8");
         distance = userIntInput.nextInt();
        
         System.out.println("Enter the time of the run in minutes, rounding to the nearest minute (eg. 62:30 is 63 minutes, 1:30:00 is 90 minutes, etc).");
         time = userIntInput.nextInt();
    }
   

    public static void fillLog()
        {
        runs.add(new log(distance, date, time));
        }
    public static void getLog() {
    	//the new stuff
    	System.out.println(" -----------------------------------------");
        System.out.printf("| %-12s | %-10s | %-10s |\n", "Date", "Distance", "Time");
        System.out.println(" -----------------------------------------");

        for (int i = 0; i < runs.size(); i++) {
            System.out.printf("| %-12s | %-10d | %-10d |\n", runs.get(i).getDate(), runs.get(i).getDistance(), runs.get(i).getTime());
            System.out.println(" -----------------------------------------");
        }

      //  System.out.println(" -------------------------------------------------");    
        System.out.println("Would you like to add another run? Type (1) for yes or (2) for no.");
        int again = userIntInput.nextInt();
        if (again==1) {
        	working = true;
        }
        else {
        	working = false;
        }
        System.out.println("Would you like a 10k time prediction? It will be based on a four mile run time. If you don't have a four mile run time it won't work. Type (1) for yes or (2) for no.");
        int prediction = userIntInput.nextInt();
        if(prediction == 1) {
        	
        }
    	}
    

    
    }
    
    