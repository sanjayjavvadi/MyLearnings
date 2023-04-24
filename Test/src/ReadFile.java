import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		URI fileName = null;
		try {
			fileName = new URI("C:\\DynoABSLoad\\SourceDyno\\4DRBUC8NXPB282463-2022-06-08-11-02.TXT");
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Stream<String> lines = Files.lines(Paths.get(fileName), Charset.defaultCharset())) {
			  lines.forEachOrdered(System.out::println);
			}
		catch(Exception e) {
			
		}

	}

	

}
