/*
 * Isaac Apolonio-Duran
 * 8-26-19
 * EmployeeFileOp.java
 * 
 * 
 * reads from a file and sorts the data by age under / equal to 30 and writes them to another file.
 * 
 * 
 * 
 * 
 */
package cs272program;
import java.io.*;

class Employee
{
	String name, number, state, zip, sex;
	int age;
	
	Employee(String nameIn, String numberIn, String stateIn, String zipIn, String sexIn, int ageIn)
	{
		setName(nameIn);
		setNumber(numberIn);
		setState(stateIn);
		setZip(zipIn);
		setSex(sexIn);
		setAge(ageIn);
	}
	private void setName(String nameIn)
	{
		name = nameIn;
	}
	private void setNumber(String numberIn)
	{
		number = numberIn;
	}
	private void setState(String stateIn)
	{
		state = stateIn;
	}
	private void setZip(String zipIn)
	{
		zip = zipIn;
	}
	private void setSex(String sexIn)
	{
		sex = sexIn;
	}
	private void setAge(int ageIn)
	{
		age = ageIn;
	}
}

public class EmployeeFileOp {
	
	//private static Employee[] employees = null;
	private static Employee employees[] = new Employee[297];	//I had to hardcode the amount of lines from the provided file. I couldnt figure out how to get it.
	public static void read(String fileName)
	{
		int no = 0;
		String line = "";
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null)
			{
				if (no == 0)
				{
					//int totalNumber = Integer.parseInt(line);
                	//employees = new Employee[totalNumber];
				}
				else
				{
					String[] lineStr = line.split(",");
					if(lineStr.length!=22) continue;
					//System.out.println(no + "   " + lineStr[0] + lineStr[1]+ "    " + lineStr.length) ;   //USED TO DEBUG
					
					employees[no-1] = new Employee(lineStr[0] + lineStr[1], lineStr[2], lineStr[3], lineStr[4], lineStr[7], Integer.parseInt(lineStr[6]));
				}
				no++;
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("unable to open file");
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file");
		}
		System.out.println("File reading succeeded");
	}//end read();
	
	
	public static void write(String fileName)
	{
		try
		{
			File file = new File(fileName);
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Employee name, Employee number, State, Zip, Age, Sex\n");
			for(int i = 0; i < employees.length; i++)
			{
				if(employees[i].age <= 30)	//if employee age is less than or equal to 30 (young)
				{
					bw.write(employees[i].name + " , " + employees[i].number + " , " + employees[i].state + " , " + 
							employees[i].zip + " , " + employees[i].age + " , " + employees[i].sex + " , \n");
				}

			}
			bw.close();
			fw.close();
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("successfully wrote pairs to file: " + fileName);
	}//end write();
		
	
	
	public static void main(String[] args) {
		read("core_dataset.csv");
		write("young_employee.csv");
	}
	


}

