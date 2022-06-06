import org.shapes.*;
import java.util.*;
class TestPackage
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Area of square is"+sq.area());
		System.out.println("Enter the radius of the circle :");
		int r=sc.nextInt();
		Circle c1=new Circle(r);
		System.out.println("Area of circle is"+ c1.area());
		System.out.println("Enter the base and height of the triangle :");
		int b= sc.nextInt();
		int h=sc.nextInt();
		Triangle t = new Triangle(b,h);
		System.out.println("Area of triangle is "+t.area());
	}
}