
public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(dogTrouble(true,14));
	}
	
	public static boolean  dogTrouble(boolean barking,int hour) {
		return (barking && (hour < 7 || hour > 20));
	}

}
