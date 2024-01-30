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
		System.out.println("");
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


