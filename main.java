/*
 * Isaac Apolonio-Duran 
 * 9-5-19
 * main.java
 * 
 * This main function tests all the functions declared in Employee.java by creating different employee objects and an
 * empty one.
 * 
 * 
 */
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		//Create an empty Employee object
		Employee newEmployee = new Employee();
		
		//Create two unique Employees
		Employee E1 = new Employee("Jake", "TX", 5038, 21, 22402, 1234, 5678, 9012);
		Employee E2 = new Employee("Andrew", "OK", 8520, 24, 40182, 1111, 2222, 3333);
		
		//Display two unique Employees
		System.out.println(E2);
		System.out.println(E1);
		System.out.println();	//whitespace for console readability
		
		//Display newEmployee and test Equals() against E1 (Jake)
		System.out.println("NEW EMPLOYEE: " + newEmployee);
		System.out.println("Is newEmployee equal to jake? :" + E1.Equals(newEmployee));
		System.out.println();	//whitespace for console readability

		
		//Copy Jake's data to NewEmployee testing copy constructor Employee(Employee obj)
		System.out.println("Copying Jake to new employee...");
		newEmployee = new Employee(E1);
		System.out.println();	//whitespace for console readability
		
		//Display newEmployee after copy to make sure it worked.
		System.out.println("NEW EMPLOYEE AFTER COPY: " + newEmployee);
		System.out.println("Is newEmployee equal to jake? :" + E1.Equals(newEmployee));
		System.out.println();	//whitespace for console readability

		
		//Display all advisors of E1 (Jake) and E2 (Andrew)
		System.out.println("All Advisor ID's for Jake and Andrew: ");
		System.out.println(Arrays.toString(E1.getAllAdvisors(E1, E2)));

	}

}
