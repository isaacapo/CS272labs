/*
 * Isaac Apolonio-Duran 
 * 9-5-19
 * Employee.java
 * 
 * This file declares the Employee object and its member functions and variables. 
 * 
 * 
 */import java.lang.reflect.Array;

public class Employee {
	
	//Variables
	String name, state;
	int number, age, zip;
	int advisors[] = new int[3];
	
	//Constructors
	
	Employee(String nameIn, String stateIn, int numberIn,
			int ageIn, int zipIn, int a1, int a2, int a3)	//Constructor for all variables
	{
		SetName(nameIn);
		SetState(stateIn);
		SetNumber(numberIn);
		SetAge(ageIn);
		SetZip(zipIn);
		SetAdvisors(a1, a2, a3);
	}
	Employee()	//Default Constructor
	{
		SetName(null);
		SetState(null);
		SetNumber(0);
		SetAge(0);
		SetZip(0);
		//SetAdvisors(); not working
		advisors[0] = 0;
		advisors[1] = 0;
		advisors[2] = 0;
	}
	
	public Employee(Employee obj)	//Copy Constructor
	{
		SetName(obj.GetName());
		SetState(obj.GetState());
		SetNumber(obj.GetNumber());
		SetAge(obj.GetAge());
		SetZip(obj.GetZip());
		SetAdvisors(obj.advisors[0], obj.advisors[1], obj.advisors[2]);
		advisors = obj.GetAdvisors();
	}
	
	public String toString()	//toString Override
	{
		String employeeOutput;
		employeeOutput = GetName() + ", " + GetNumber() + ", " + GetAge() + ", " + GetZip()
		+ ", ADVISORS: " + advisors[0] + ", " + advisors[1] + ", " + advisors[2];

		return employeeOutput;
	}

	public boolean Equals(Employee obj)	//Equals function testing one employee number against another
	{
		if(number == obj.GetNumber())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//get Functions
	String GetName()
	{
		return name;
	}
	String GetState()
	{
		return state;
	}
	int GetNumber()
	{
		return number;
	}
	int GetAge()
	{
		return age;
	}
	int GetZip()
	{
		return zip;
	}
	int[] GetAdvisors()
	{
		return advisors;
	}
	public static int[] getAllAdvisors(Employee e1, Employee e2)	//getAllAdvisors function to return an array of all advisor's employee ID's
	{
		int e1Adv[] = e1.GetAdvisors();
		int e2Adv[] = e2.GetAdvisors();
		
		int allAdvisors[] = new int[6];
		allAdvisors[0] = e1Adv[0];
		allAdvisors[1] = e1Adv[1];
		allAdvisors[2] = e1Adv[2];
		allAdvisors[3] = e2Adv[0];
		allAdvisors[4] = e2Adv[1];
		allAdvisors[5] = e2Adv[2];
		
		
		return allAdvisors;
		
	}
	
	//Set Functions
	void SetName(String nameIn)
	{
		name = nameIn;
		
	}
	void SetState(String stateIn)
	{
		state = stateIn;
	}
	void SetNumber(int numberIn)
	{
		number = numberIn;
	}
	void SetAge(int ageIn)
	{
		age = ageIn;
	}
	void SetZip(int zipIn)
	{
		zip = zipIn;
	}
	void SetAdvisors(int a1, int a2, int a3)
	{
		Array.set(advisors, 0, a1);
		Array.set(advisors, 1, a2);
		Array.set(advisors, 2, a3);
	}
}


