import java.util.Scanner;
public class Circle {
private static final double PI = 3.14;
private final double radius;

public Circle(double radius) {
this.radius = radius;
}
public static void main(String[] args) {
	 int R;
	
		System.out.println("------------------------------------------------------------");
		System.out.println("CircleCalc v1.0");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		 int min = 1; 
	     int max = 50; 
	      
		 R = (int)Math.floor(Math.random() * (max - min + 1) + min);
		 System.out.println(R);
		//Scanner R = new Scanner(System.in);
		//Circle c = new Circle.nextFloat());
		 System.out.println("");
		 System.out.println(Area(R));
		 System.out.println("");	
		}
		
		
	public static double Area(int R) {
	double S;
	S = PI*R*R;
	System.out.println("Area of Circle: " +S);
	
	return S;
}
}


