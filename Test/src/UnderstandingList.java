import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnderstandingList {

	public static void main(String[] args) {
		
	/*	List<String> ls =new ArrayList<String>();
		
		ls.add("Sanjay");
		ls.add("sam");
		ls.add("satish");
		ls.add("dp");
		
	    System.out.println("Sorting the elements in the list");
		
	    Collections.sort(ls);
	    
	    System.out.println("After Sorting the elments in the list");
	    
	    int i=0;
	    while(i<ls.size())
	    {
	    	System.out.println(ls.get(i));
	    	i++;
	    }
	    */
	   
		Employee e=new Employee();
		Employee e1= new Employee(201,"sam",3445.00,23);
		Employee e2= new Employee(202,"kuran",3446.00,23);
		
		Employee e3= new Employee(203,"sanjay",3444.00,25);
		Employee e5= new Employee(205,"vasu",6444.00,40);
		Employee e4= new Employee(204,"srinu",3444.00,26);
		
		List<Employee> employeelist = new ArrayList<Employee>();
		
		employeelist.add(e1);
		employeelist.add(e2);
		employeelist.add(e3);
		employeelist.add(e5);
		employeelist.add(e4);
		
		
		Collections.sort(employeelist,e);
		
		for(Employee emp:employeelist)
		{
			System.out.println(emp.getEmpid() + "----" + emp.getEmpName());
		}

	}

}



