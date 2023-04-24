import java.util.regex.Pattern;

public class SpiltTest {
	private static String REGEX = "\\\\";
    private static String INPUT = "\\\\BRKSVP843\\f$\\Truck Manufacturing\\TestDyno\\Dyno_Test";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(REGEX);

        String[] result = pattern.split(INPUT);
        for (String data: result) {
            System.out.println(data);
        }

	}

}
