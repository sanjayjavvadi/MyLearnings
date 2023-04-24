import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFileUsingStreams {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
			String fileName ="C:\\DynoABSLoad\\SourceDyno\\4DRBUC8NXPB282463-2022-06-08-11-02.TXT";
		
		try (Stream<String> lines = Files.lines(Paths.get(fileName), Charset.defaultCharset())) {
			  lines.forEachOrdered(System.out::println);
			  
			}
		catch(Exception e) {
			
		}

	}

	

}
