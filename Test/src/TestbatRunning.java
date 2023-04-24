import java.io.File;
import java.io.IOException;

public class TestbatRunning {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		 String locationOfIvestBatch ="C:\\Progra~2\\IVEST\\RestartthroughApp.bat";
	       //%ProgramFiles%
		  String path="cmd /c start "+ locationOfIvestBatch +" ^& exit";
			Runtime rn=Runtime.getRuntime();
		 
		 try {
		
			 rn.exec(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
         System.out.println("End --");
	}

}
