package javatask6;
import java.util.Scanner;

public class Question2employee
{
	
public static int id;
static String firstname;
static String lastname;
String name;
public static int salary;
int annualsalary;
float raisesalary;
float raisepercent;
	
public int getID()
{
	return id;
	
}

public int getsalary()
{
	return salary;
}

public String getfirstname()
{
	return firstname;
	
}

public String getlastname()
{
	return lastname;
	
}

public String getname()
{
	name= firstname + " " + lastname;
	return name;
}

public int getannualsalary() {
	
	annualsalary = salary*12;
	return annualsalary;
	
}

public float getraisesalary()
{
	
	raisesalary= (raisepercent*annualsalary)+annualsalary;
	return raisesalary;
	
}
 public void tostring(int id,String firstname,String lastname,int Salary) {
	
	 System.out.println("________________________________________________");
	 
	 System.out.println("Empolyee details --- using tostring method ");
	 System.out.println("ID -- "+id);
	 System.out.println("First Name  -- "+firstname);
	 System.out.println("Last Name  -- "+lastname);
	 System.out.println("Salary -- "+salary);
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question2employee details = new Question2employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		
		details.id = sc.nextInt();
		System.out.println("Enter Employee FirstName");
		details.firstname = sc.next();
		System.out.println("Enter Employee LastName");
		details.lastname = sc.next();
		System.out.println("Enter Employee Salary");
		details.salary = sc.nextInt();
		System.out.println("Enter Employee Salary Hike Percentage");
		details.raisepercent = sc.nextFloat();
		
		System.out.println("Empolyee Id is - " + details.getID());
		System.out.println("Employee FirstName is - " + details.getfirstname());
		System.out.println("Employee LastName is - " + details.getlastname());
		System.out.println("Employee Name is - " + details.getname());
		System.out.println("Employee Salary is - " + details.getannualsalary());
		System.out.println("Employee Salaryhike is - " + details.getraisesalary());
		Question2employee obj = new Question2employee();
		
		obj.tostring(id,firstname,lastname,salary);
			
	}
}


