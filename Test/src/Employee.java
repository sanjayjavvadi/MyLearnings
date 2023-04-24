import java.io.Serializable;
import java.util.Comparator;

public class Employee  implements Comparator<Employee> , Serializable     {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName, double sal, int age,String plantWorking) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.sal = sal;
		this.age = age;
		this.plantWorkingFor=plantWorking;
	}

	int empid;
	String empName;
	double sal;
	int age;
	String plantWorkingFor;
	
	public String getPlantWorkingFor() {
		return plantWorkingFor;
	}

	public void setPlantWorkingFor(String plantWorkingFor) {
		this.plantWorkingFor = plantWorkingFor;
	}

	public int getEmpid() {
		return empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", sal=" + sal + ", age=" + age + ",plantWorkingFor="+plantWorkingFor+"]";
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.age - e2.age;
	}
	
	/*	@Override
      public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.age == o.age)
		{
			return 0;
		}
		
		else if(this.age > o.age)
		{
			return 1;
		}
		
		return -1;
	} */


	
	
	
	
}
