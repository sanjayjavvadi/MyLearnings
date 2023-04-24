
public class X {
	static int i=1111;
	
	static {
		i=i-- - --i;
		
	}
	{
		i= i++ + ++i;
	}

}
