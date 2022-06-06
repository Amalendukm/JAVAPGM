import java.util.*;
public class smallest
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int x=ob.nextInt();
		System.out.println("Enter the 2nd number:");
		int y=ob.nextInt();
		System.out.println("Enter the 3rd number:");
		int z=ob.nextInt();
		System.out.println("The smallest value is:"+small(x,y,z) +"\n");
	}
	public static int small(int x,int y,int z)
	{
		return Math.min(Math.min(x,y),z);
	}
}
		