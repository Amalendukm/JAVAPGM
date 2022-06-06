import java.util.*;
public class circle
{
	public static void main(String args[])
	{
		double r;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		r=ob.nextDouble();
		System.out.print("Area = "+(Math.PI *r*r));
		System.out.print("\n Perimeter="+(2*Math.PI*r));
	}
}
		