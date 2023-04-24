
public class ZeroSum    {
	
	int calories = 0;
	
  public void gainCalories() {
	  calories=1000;
	}
	
   public void burnCalories() {
	   calories=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZeroSum zeroSum = new ZeroSum();
		Thread t1 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				zeroSum.gainCalories();
			}
			
			
		});
		
		t1.setPriority(10);
		

		
		Thread t2 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				zeroSum.burnCalories();
			}
			
			
		});
		
		t2.setPriority(3);
		
		System.out.print(zeroSum.calories);

	}

	
	

}
