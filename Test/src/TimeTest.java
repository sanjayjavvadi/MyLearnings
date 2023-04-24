
public class TimeTest {

	public static void main(String[] args) {
		long timeInMilli = 500;
		long startTime = System.currentTimeMillis();
		boolean exitLoop = false;
		
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Start Time:" + startTime + "    TargetTime:" + estimatedTime);
		while(!exitLoop)
		{
			estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("estimatedTime:"+estimatedTime+":timeInMilli:"+timeInMilli);
			if(timeInMilli < estimatedTime )
			{
				exitLoop = true;
			}
		}
		
		System.out.println("waitForTime Completed!");
	}

}
