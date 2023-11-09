package trainingLog;

import java.util.ArrayList;
import java.util.Scanner;
public class runner 
    {
    	static int distance = 0;
    	static String date = "";
    	static int time = 0;
    	static ArrayList<log> runs = new ArrayList<log>();
    public static void main(String[] args) 
        {
        work();
        fillLog();
        getLog();
        
        }
    
    public static void work()
    {
    	Scanner userIntInput = new Scanner(System.in);
        Scanner userStringInput = new Scanner(System.in);
       
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
    	for(int i =0; i < 8; i++) {
    		System.out.println(" -----------------");
    		System.out.println("| Date: "+runs.get(i).getDate() +"   |"+ runs.get(i).getDistance()  +  "   |" +  runs.get(i).getTime()  +" |");
    		System.out.println(" -----------------");
    	
    	}
    	
    
    }
    
    }