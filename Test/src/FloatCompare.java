
public class FloatCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f1 = -9999.00f; 
		float f2 = -9999.00f; 
  
        // function call to compare two float values 
        if (Float.compare(f1, f2) == 0) { 
  
            System.out.println("f1=f2"); 
        } 
        else if (Float.compare(f1, f2) < 0) { 
  
            System.out.println("f1<f2"); 
        } 
        else { 
  
            System.out.println("f1>f2"); 
        } 
            
	}

}
