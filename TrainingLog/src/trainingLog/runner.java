package trainingLog;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class runner 
    {
    	static Random rand = new Random();
    	static Scanner userIntInput = new Scanner(System.in);
        static Scanner userStringInput = new Scanner(System.in);
    	static int distance = 0;
    	static String date = "";
    	static int time = 0;
    	static boolean working = true;
    	static ArrayList<log> runs = new ArrayList<log>();
    public static void main(String[] args) 
        {
       //double randNum1 = rand.nextDouble();
       
       while(working) {
        work();
        fillLog();
        getLog();
       }
       if(working == false) {
    	   System.out.println("Have a good run today!");
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
    	System.out.println(" --------------------------------------------");
        System.out.printf("| %-12s | %-10s | %-10s |\n", "Date", "Distance (mi)", "Time (min)");
        System.out.println(" --------------------------------------------");

        for (int i = 0; i < runs.size(); i++) {
            System.out.printf("| %-12s | %-13d | %-10d |\n", runs.get(i).getDate(), runs.get(i).getDistance(), runs.get(i).getTime());
            System.out.println(" --------------------------------------------");
        }
        double unoOrDos = Math.random()*1;
       
        double random1 = Math.random()+2;
        double lastRun = runs.get(runs.size()-1).getDistance();
        double lastTime = runs.get(runs.size()-1).getTime();
     //   System.out.println(lastTime);
        System.out.println("Would you like a 10k race time prediction based on the run you just added? This will not work if the run is over 6 miles. \n The calculation is based on the assumption you will be racing the distance, and going all out."
                + " \n Type (1) for yes or (2) for no.");
        int prediction = userIntInput.nextInt();
        if (prediction == 1) {
            double ten = 0;
            if (lastRun <= 6) {
                if (lastRun == 1) {
                    ten = lastTime * 6 - 1;
                } else if (lastRun == 2) {
                    ten = lastTime * 3 - 2;
                } else if (lastRun == 3) {
                    ten = lastTime * 2 - 2.5;
                } else if (lastRun == 4) {
                    ten = lastTime * 1.5 - 3;
                } else if (lastRun == 5) {
                    ten = lastTime * 1.2 - 3.5;
                } else if (lastRun == 6) {
                    ten = lastTime - 4;
                } else {
                    System.out.println("Unable to make calculation");
                    return; 
                }
                if(unoOrDos == 0) {
                	ten = ten - random1;
                }
                else if(unoOrDos == 1) {
                	ten = ten + random1;
                }

                System.out.println("Predicted 10k race time: " + ten + " minutes");
            } else {
                System.out.println("The run is over 6 miles, prediction not possible.");
            }
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
        
    	}
    

    
    }
    
    