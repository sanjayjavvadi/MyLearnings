package educative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercise {
	
	public static void main(String args[]) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1("Alex", 23, "USA"));
		list.add(new Employee1("Dave", 34, "India"));
		list.add(new Employee1("Carl", 21, "USA"));
		list.add(new Employee1("Joe", 56, "Russia"));
		list.add(new Employee1("Amit", 64, "China"));
		list.add(new Employee1("Ryan", 19, "Brazil"));

		for (Employee1 e : list) {
			if (e.getAge() > 50) {
				System.out.println(e.getName());
			}
		}
		 
		
		list.removeIf(x -> x.getCountry().equalsIgnoreCase("USA"));
		
		
		System.out.println("--------------");
		
		for (Employee1 e : list) {
			
				System.out.println(e.toString());
			
		}
		
		System.out.println("--------------");
		Collections.sort(list);
		
		for (Employee1 e : list) {
			
			System.out.println(e.toString());
		
	}
		
		
	}

}
