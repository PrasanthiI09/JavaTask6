/* Name and age of person - get methods */

package javatask6;
import java.util.Scanner;
public class Question1nameandage {
	
	private int age;
	private String name;
	
	
public String getName()
{
	return name;
	
}
public int getAge()
{ return age;
}

public static void main(String[] args)
{
	Question1nameandage att = new Question1nameandage();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Age of a person");
	att.age = sc.nextInt();
	System.out.println("Enter the Name of a person");
	att.name = sc.next();
	System.out.println("Name of a person "+ att.getName());
	System.out.println("Agef a person "+ att.getAge());
	
	
}
}
