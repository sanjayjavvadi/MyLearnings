/**
 * 
 */


import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author yyy1g81
 *
 */
public class CallCSNService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			URL url = new URL("http://SPRPC-L37505:8083/csndata/savedata");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String input = "{\"siteCode\":\"002\",\"ataCode\":\"12\",\"vin\":\"1HTKHPVM6LH249210\",\"serialNo\":\"123456\"}";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				System.out.println("Successfully completed : HTTP : "
					+ conn.getResponseCode());
			}

			/*BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}*/

			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		 }

	}

}
