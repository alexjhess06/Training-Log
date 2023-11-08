package trainingLog;

import java.util.ArrayList;
import java.util.Scanner;
public class runner 
    {
    	static int distance;
    	static String date;
    	static int time;
    public static void main(String[] args) 
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
    static ArrayList<log> sessions = new ArrayList<log>();

    public static void fillLog()
        {
        sessions.add(new log(distance, date, time));
        }
    
    }