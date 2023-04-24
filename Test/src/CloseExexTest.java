import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CloseExexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			try {
				String EXE = "C:\\Users\\yyy1z67\\Desktop\\empty.bat";
				String strResult = null;
				String tempExe = "cmd /C start /min " + EXE + " ^& exit";
				Process p;

				p = Runtime.getRuntime().exec(tempExe);

				BufferedReader bufReader = new BufferedReader(new InputStreamReader(p.getInputStream()));

				System.out.println("Launching programming: " + tempExe);

				long iTs = System.currentTimeMillis();
				System.out.println("VCP Started --> " + iTs);
				long tTs = 0;

				if (bufReader != null) {
					System.out.println("Still processing data from VCP...");

					while ((strResult = bufReader.readLine()) != null) {

					}

				}

				p.waitFor();
			} catch (Exception e) {

				// return false;
			}
		}
	}

}
