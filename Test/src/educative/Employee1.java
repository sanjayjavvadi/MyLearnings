package educative;


public class Employee1 implements Comparable<Employee1> {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	private String name;
	

	private int age;
	private String country;
	
	public Employee1(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
          return this.country.compareTo(o.country);
			
	}


	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", country=" + country + "]";
	}



	



}
