import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	private static final String DEFAULT_DATE_FORMAT_1 = "MM-dd-yyyy";

	private static final DateTimeFormatter defaultDateFormatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT_1);

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		fromLocalDate();
	}
	

	public static void fromLocalDate() throws ParseException {
		
		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		
		
		Date dateFormatter3	= new SimpleDateFormat("yyyy-mm-dd").parse("2022-06-08");
	//	System.out.println(dateFormatter3);
		LocalDateTime dateTime = new LocalDateTime();
		dateTime.atZone(ZoneId.systemDefault()).toInstant()
		

	}


}
