package trainingLog;
import java.util.ArrayList;
public class sessions
	{
		
		
		static ArrayList<log> runs = new ArrayList<log>();

		    public static void fillLog(int distance, String date, int time)
		        {
		        runs.add(new log(distance, date, time));
		        
		        }
	}
