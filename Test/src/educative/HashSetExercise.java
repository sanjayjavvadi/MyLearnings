package educative;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExercise {
	public static void main(String args[]) {
		int[] data = {12, 34, 1, 56, 43, 34, 65};
		int duplicate;
        int sumOfArray=0;
        int sumOfSet=0;
		// Your logic will go here
		Set<Integer> withoutDulpicateData = new HashSet<Integer>();
		
		for(int i=0;i<data.length;i++) {
			withoutDulpicateData.add(data[i]);
		}
		
		for(int i=0;i<data.length;i++) {
			sumOfArray+=data[i];
		}
		
		List<Integer> ls = new ArrayList<Integer>(withoutDulpicateData);
		
		for(int i=0;i< ls.size();i++) {
			sumOfSet+=ls.get(i);
		}
		
		duplicate= sumOfArray - sumOfSet;

		System.out.println(duplicate);
	}
}
