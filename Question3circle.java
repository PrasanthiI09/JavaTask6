package javatask6;

public class Question3circle {

	public Question3circle() {
		
		System.out.println("This is the default constructor - first constructor");
	}
	public Question3circle(int a,int b) {
		
		System.out.println("This is the two argument parameterized constructor --the two numbers are "+a+" and "+b);
	}
	public void calradius() {
		double radius=3.3;
		double circumfarence = 2*Math.PI*radius;
		System.out.println("Circumfarence of Radius "+radius+" is--- "+circumfarence);	
	}
	public static void main(String[] args) {
	
		new Question3circle();
		new Question3circle(4,5);
		Question3circle myobj=new Question3circle();
		myobj.calradius();
				
	}
}
