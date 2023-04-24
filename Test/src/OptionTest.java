import java.util.Optional;
import java.util.function.Supplier;

public class OptionTest {
	 public static void main(String[] args) {   
	
	Optional<String> timeString =  Optional.ofNullable(null);   
//	String s=  timeString.toString();
	
    Supplier<String> noTime = () -> "No time Mention";
	System.out.println(timeString.orElseGet(noTime));
 }
}
