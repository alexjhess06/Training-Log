package trainingLog;
import java.util.ArrayList;
public class log
	{
		
	    
	    int distance;
	    String date;
	    int time;
	    
	    

	    public log (int d, String n, int t)
	        {
	        distance = d;
	        date = n;
	        time = t;
	       
	        }

		public int getDistance()
			{
				return distance;
			}

		public void setDistance(int distance)
			{
				this.distance = distance;
			}

		public String getDate()
			{
				return date;
			}

		public void setDate(String date)
			{
				this.date = date;
			}

		public int getTime()
			{
				return time;
			}

		public void setTime(int time)
			{
				this.time = time;
			}
	}

		
	
