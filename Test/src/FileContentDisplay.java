import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContentDisplay {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  try {
			String fileName= br.readLine();
	        File file = new File("c:/temp/"+fileName+".txt");
	       
	         FileWriter fw = new FileWriter(file);
	         BufferedWriter bw = new BufferedWriter(fw);
	         String line = "";
	         while(true){
	             line = br.readLine();
	            
	          bw.write(line);
	          bw.newLine();
	       
	        if("exit".equalsIgnoreCase(line)){
	        	bw.close();
	        	break;
	           
	            
	        }
	       }
	       
        
	}
		  catch(Exception ex) {
	        	
	        }
  }
}



