
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat dateFormat = new SimpleDateFormat ("HH:mm:ss ");
		 Date date = dateFormat.parse("8:00:09 AM");
		 System.out.println(date);
	}
}
