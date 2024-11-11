package javatask6;
import java.util.Scanner;


public class Question4account {
	public int balance;
	public int salary;
	public static int accountnumber;
	public static String name;
		
	
	public Question4account() {
		
		System.out.println("This is default constructor of Account class");
	}
public Question4account(int accountnumber, String name) {
	System.out.println("This is Parameterized constructor of Account class");
	System.out.println("Account number is -- "+accountnumber);
	System.out.println("Account Holder name is --- "+name);
	
	}
public void balance(int salary) {
	balance = salary;
	System.out.println("Balance amount is -- "+balance);
	
}
public void withdraw() {
	
	System.out.println("This method is to withdraw amount");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amount to withdraw -- ");
	int withdrawamount=sc.nextInt();
	balance = balance - withdrawamount;
	System.out.println("Withdraw amount is -- "+withdrawamount);
	System.out.println("Balance amount after withdrawl is -- "+balance);
	
	
}
public void deposit() {
	System.out.println("This method is to Deposit amount");
	Scanner sc = new Scanner(System.in);
	int depositamount=sc.nextInt();
	balance = balance + depositamount;
	System.out.println("Depodit amount is -- "+depositamount);
	System.out.println("Balance amount after deposit is -- "+balance);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4account myobj=new Question4account();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account holder name is -- ");
		String name = sc.next();
		System.out.println("Enter Account number -- ");
		int accountnumber = sc.nextInt();
		System.out.println("Enter the Salary amount -- ");
		 int salary = sc.nextInt();
			
		 Question4account myobj1=new Question4account(accountnumber,name);
		System.out.println("Account number is -- "+accountnumber);
		System.out.println("Account holder name is -- "+name);
		System.out.println("Salary is -- "+salary);
		myobj.balance(salary);
				myobj.withdraw();
				myobj.deposit();			
		
		
	}

}
