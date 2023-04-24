import java.util.concurrent.Callable;

public class AlphabetThread implements Callable{

	char[] alphabets =  new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};

	@Override
	public Boolean call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<alphabets.length;i++) {
			System.out.println(alphabets[i]);
			break;
		}
		return true;
	}
	

}
