class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}
public class Q4 {
	public static Employee searchByID(Employee[] arr, int id) {
		for(int i=0; i<arr.length; i++) {
			if(id==arr[i].getId()) {
				return arr[i];
			}
		}
		return null;
	}

	public static Employee searchByName(Employee[] arr, String name) {
		for(int i=0; i<arr.length; i++) {
			if(name==arr[i].getName()) {
				return arr[i];
			}
		}
		return null;
	}

	public static Employee searchBySalary(Employee[] arr, double salary) {
		for(int i=0; i<arr.length; i++) {
			if(salary==arr[i].getSalary()) {
				return arr[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new Employee(2, "vaishnavi", 5000.0);
		emps[1] = new Employee(1, "thete", 2000.0);
		emps[2] = new Employee(4, "dengu", 4000.0);
		emps[3] = new Employee(6, "vatsal", 7000.0);
		emps[4] = new Employee(3, "sarangi", 1000.0);

		System.out.println(searchByID(emps, 4));
		System.out.println(searchByName(emps, "vaishnavi"));
		System.out.println(searchBySalary(emps, 7000.0));
	}
}
