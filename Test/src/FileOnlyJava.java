import java.io.*;

public class FileOnlyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File files = new File("C:\\Test\\");

		File[] filesInFolder = files.listFiles();
		for (int i = 0; i < filesInFolder.length; i++) {
			if (filesInFolder[i].getName().endsWith(".java")) {
				System.out.println(true);
			}
		}

	}

}
