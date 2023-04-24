import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ibm.db2.jcc.am.o;

public class TestInputBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int oldparseABS(String file, String path) throws Exception 
	{
		String[] rvalue = new String[140];
		
		int index = 0;
		byte[] bytes = new byte[1024];
		File abs_file = new File(path, file);

		if (abs_file.exists()) 
		{
			try 
			{
				InputStream istream = new FileInputStream(abs_file);
				
				
				final int bufferSize = 1024;
				final char[] buffer = new char[bufferSize];
				final StringBuilder out = new StringBuilder();
				
				Reader in = new InputStreamReader(istream, "UTF-8");
				for (; ; ) 
				{
				    int rsz = in.read(buffer, 0, buffer.length);
				    if (rsz < 0)
				        break;
				    out.append(buffer, 0, rsz);
				}
				
				String[] valueList = out.toString().trim().split(",");
				
				istream.close();
				
				rvalue = new String[500];
				
				for(int i=0;i<valueList.length;i++)
				{
					valueList[i].trim();
					boolean hasChar = valueList[i].matches("[ -]*");
					
					if(valueList[i].isEmpty() || valueList[i] == " " || hasChar)
					{
						rvalue[i] = "NA";
					}
					else
					{
						rvalue[i] = new String(valueList[i]).trim();	
					}
					
					System.out.println(("rvalue[" + (i) + "] = " + rvalue[i]));
				}
				
				index = valueList.length;
				
				return index;	
				
			} // end try

			catch (IOException e) 
			{
				
				System.out.println(e.toString());
				
				//logger.debug("index= " + index);
			}

		} // end file exist

		return 0;

	}// parse post ab

	
	private static BufferedReader getBufferedReader() throws FileNotFoundException {
	    File file = new File("C:\\DynoABSLoad\\SourceABS","000829_0223_080822.Out");
	    FileReader fileReader = new FileReader(file);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    return bufferedReader;
	}

	
	public static int newparseABS(String file,String path) throws Exception{
		
	  BufferedReader bufferedReader = getBufferedReader();
	  String readLine = null;
	  
	  int lineNumber =1;
	  List<String> rvalues;
	  String[] csvFields = new String[500];
	  while ((readLine = bufferedReader.readLine())!=null) {
          readLine.split(",");
	  }
       rvalues = Arrays.asList(csvFields);
            
       rvalues.stream().map(o->o.isEmpty() || o ==" " || o.matches("[ -]*") == "NA")
    		   
    		   
    		   )
       
       
      
     
       
     //  rvalues.stream().map
	}

	
	
	
}
