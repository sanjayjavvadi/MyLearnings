import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExampleForMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		for(int i =1;i<=5;i++) {
			employeeList.add(new Employee(i, "Sanjay", 100, 32, "UST"));
			employeeList.add(new Employee(i, "Sanjay", 100, 32, "congizant"));

		}
		
		Map<String, ArrayList<Employee>> map = new HashMap<String,ArrayList<Employee>>();
		 
		map.put("UST-GLOBAL1", employeeList);
		map.put("COGIANT", employeeList);
		map.put("UST-GLOBAL2", employeeList);
		
		map.entrySet().stream().flatMap(k ->k.getValue().stream())
				
		
		
		 
   
	}
	
	private static  Employee validate(Employee e) {
		
			System.out.println("UST-Global: "+e.toString());
		
		return e;
	}
	
	
	private static  List<Employee> program(String key,List<Employee> employee) {
		// Read method from key 
		// Write from the list
        readKey(key);
        writeValues(employee);
		System.out.println("UST-Global: "+employee.toString());
	
	return employee;
}

	private static void writeValues(List<Employee> employee) {
		// TODO Auto-generated method stub
		
	}

	private static void readKey(String key) {
		// TODO Auto-generated method stub
		System.out.println("Read the the key:"+key);
	}
 
	 

}
