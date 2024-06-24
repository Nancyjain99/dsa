import java.util.Arrays;

public class Q3 {
	  
	public static void Insertion_Sort(Employee arr[]) {
	        Employee temp = null;
	        for (int i = 1; i < arr.length; i++) {
	            temp = arr[i];
	            int j;
	            for (j = i - 1; j >= 0; j--) {
	                if (temp.getSalary() < arr[j].getSalary()) {
	                    arr[j + 1] = arr[j];
	                } else {
	                    break;
	                }
	            }

	            arr[j + 1] = temp;
	        }

	    }
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new Employee(2, "vaishnavi", 5000.0);
		emps[1] = new Employee(1, "thete", 2000.0);
		emps[2] = new Employee(4, "dengu", 4000.0);
		emps[3] = new Employee(6, "vatsal", 7000.0);
		emps[4] = new Employee(3, "sarangi", 1000.0);
		
		Insertion_Sort(emps);
		System.out.println("Sorted array : "+ Arrays.toString(emps));
	}
	
}