public class SlidingWindow {
	
	
	public static void main(String[] args) {
		int[] myIntArray = new int[]{1, 2, 3, 4, 5, 6, 7};

		double[] avgs=findAverages(3,myIntArray);
		
		for(double k : avgs) {
			System.out.println(k);
		}
		
	}
	
	public static double[] findAverages(int k,int[] arr) {
		
		double sum=0.0;
		int windowStart=0;
		int windowEnd=0;
		double[] avgCollection = new double[arr.length - k+1];
		
		return avgCollection;
	}

}
