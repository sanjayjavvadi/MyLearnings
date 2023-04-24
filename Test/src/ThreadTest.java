
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class ThreadTest {

	public static void main(String[] args) throws IOException {
		
		
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String fileName = reader.readLine();
	        
	         File file = new File("c:/temp/"+fileName+".txt");
		     InputStreamReader fs= new InputStreamReader(new FileInputStream(file));
	         BufferedReader fileIn = new BufferedReader(fs);
	        
	         int  line;
	         while(true){
		        line=Integer.parseInt(fileIn.readLine()); 
		        if(line % 2 == 0){
		            System.out.println(line);
		        }
		       
	         }
	        
	}

}
