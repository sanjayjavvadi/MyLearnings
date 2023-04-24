
public  class InnerClass implements Runnable{

	public InnerClass(){
		
	}
	
    public InnerClass(String name){
		System.out.println("To display Name ---"+name);
		run();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Inner Class values ---"+i);
		}
		
	}

	
}
