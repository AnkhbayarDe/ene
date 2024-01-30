import java.util.Scanner;
public class Circle {
private static final double PI = 3.14;
private final double radius;

public Circle(double radius) {
this.radius = radius;
}
public static void main(String[] args) {
	// int R = 3;
	
		System.out.println("------------------------------------------------------------");
		System.out.println("CircleCalc v1.0");
		System.out.println();
		System.out.println("Calculates and prints information for a user-supplied radius");
		System.out.println("------------------------------------------------------------");
		System.out.print("Enter the circle's radius: ");
		Scanner R = new Scanner(System.in);
		//Circle c = new Circle.nextFloat());

}

public static double Area(int R) {
	double S;
	S = PI*R*R;
	System.out.println("Area of Circle" +S);
	
	return S;
}
}

/*

1. Start

2. Input the the value of radius R

3. Let PI=3.14

4. Calculate area=PI*R*R

5. Print area

6.En



*/
