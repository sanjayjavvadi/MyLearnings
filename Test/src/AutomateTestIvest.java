
import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.*; 
 
public class AutomateTestIvest {

	public static void main(String[] args) throws AWTException {
		
		
		ProcessBuilder processBuilder = new ProcessBuilder("C:\\Program Files (x86)\\IVEST\\IVEST.bat");
	       
		//Process process = Runtime.getRuntime().exec(
        //            "cmd /c hello.bat", null, new File("C:\\Users\\mkyong\\"));
					
        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println(output);
                System.exit(0);
            } else {
                //abnormal...
            }
            
            
            

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
			
        Robot myrobot = new Robot();  
        
        myrobot.keyPress(KeyEvent.VK_2);
		
		
	/*	// TODO Auto-generated method stub
		System.out.println("Trying to run Ivest from programming");
		
		String command = "C:\\Program Files (x86)\\IVEST\\IVEST.bat"; 
		
		//String command ="" ;
        Runtime run = Runtime.getRuntime(); 
        try {
			run.exec(command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
        
        
        System.out.println("Last of the try ");
        
        
        */
		

	}

}
