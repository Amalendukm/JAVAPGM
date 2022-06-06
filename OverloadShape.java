import java.util.Scanner;
public class OverloadShape
{
	void calculateArea(float x )
	{
		System.out.println("Area of the square :" + x*x + " sq units");
	}
	void calculateArea(float x,float y )
	{
		System.out.println("Area of the rectangle:" + x*y +" sq units");
	}
	void calculateArea(double r)
	{
		double area = 3.14*r*r;
		System.out.println("Area of the circle:"+ area +" sq units ");
	}
	public static void main(String args[])
	{
		OverloadShape ob = new OverloadShape();
		System.out.println("Enter the side of a square:");
		Scanner sc = new Scanner(System.in);
		float side = sc.nextFloat();
		ob.calculateArea(side);
		System.out.println("Enter the side of a rectangle:");
		float side1 = sc.nextFloat();
		float side2 = sc.nextFloat();
		ob.calculateArea(side1,side2);
		System.out.println("Enter the side of a circle:");
		double rad = sc.nextDouble();
		ob.calculateArea(rad);
	}
}
