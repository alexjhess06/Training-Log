package trainingLog;
import java.util.ArrayList;
public class sessions
	{
		
		static ArrayList<log> sessions = new ArrayList<log>();

		    public static void fillLog()
		        {
		        sessions.add(new log(distance, date, time));
		        
		        }
	}
