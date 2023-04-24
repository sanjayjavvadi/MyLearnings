import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		
		map.put("SAP", Arrays.asList("Sanjay","Anju","Prakash"));
		map.put("STX", Arrays.asList("Satheesh","Sibin","Prakash","Sudheer"));
		
		
 	
		Map<String,List<Employee>> map1 = new HashMap<String,List<Employee>>();
		
		Employee prakash = new Employee(12,"Prakash",22.2,23,"SAP");
		Employee san = new Employee(13,"sanjay",22.3,23,"SAP");
		Employee anju = new Employee(14,"anju",22.4,23,"SAP");
		
		

		Employee sath = new Employee(15,"sath",22.2,23,"STX");
		Employee sib = new Employee(16,"sib",22.3,23,"STX");
		Employee susheer = new Employee(17,"susheer",22.4,23,"STX");  
		
		List<Employee> validateEmployee =  Arrays.asList(sath,sib,anju);
		
	/*	map1.put("SAP", Arrays.asList(prakash,san,anju));
		map1.put("STX", Arrays.asList(sath,sib,susheer));
		
		 Map<String,List<Employee>> employeeFinalList =	map1.entrySet(). stream().flatMap(employeeList -> 
         employeeList.getValue().stream().filter(
		   i -> validateEmployee.contains(i)))
         .collect(Collectors.groupingBy(Employee::getPlantWorkingFor)); 

         System.out.println(employeeFinalList); */
		
		List<Employee> allEmployees = new ArrayList<Employee>();
		
		allEmployees.add(prakash);
		allEmployees.add(san);
		allEmployees.add(anju);
		allEmployees.add(sath);
		allEmployees.add(sib);
		allEmployees.add(susheer);
		
	  List<Employee> actualEmployee	=allEmployees.stream()
		.filter(emp -> validateEmployee.contains(emp))
		.collect(Collectors.toList());
		
		
		System.out.println(actualEmployee);
		
		
	
	}

	private static List<Employee> showinfo(String key,List<Employee> listforPlant,List<Employee> validateEmployee) {
		
		
		List<Employee> verfifiedEmployee = listforPlant.stream().filter((i) -> validateEmployee.contains(i)).collect(Collectors.toList());
		
		Map<String,List<Employee>> finalEmployeeList = new HashMap<String,List<Employee>>();
		
		finalEmployeeList.put(key, verfifiedEmployee);
		
		
		finalEmployeeList.forEach((k,v) -> System.out.println(k +"--" + v ));
		
		  return null;
	}

}
