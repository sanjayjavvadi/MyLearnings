import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
public class ListFilesForFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	 List<File> files = listFilesForFolder("C:\\DynoABSLoad\\SourceABS");
	
	
	for(File file:files) {
		System.out.println(file.toString());
	}
	
	}
	
	private static List<File>    listFilesForFolder(String folder) {
		
		List<File> filesInFolder = null;
		try {
		       filesInFolder = Files.walk(Paths.get(folder))
			        .filter(Files::isRegularFile)
			        .map(Path::toFile)
			        .collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return filesInFolder;
		 
	}

	
}
