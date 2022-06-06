import java.util.*;
public class sumint
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 1st num:");
		int x=ob.nextInt();
		System.out.println("Enter 2nd num:");
		int y=ob.nextInt();
		System.out.println("Enter 3rd num:");
		int z=ob.nextInt();
		System.out.println("Result is=" +Sumof(x,y,z));
	}
	public static boolean Sumof(int p,int q,int r)
	{
		return((p+q)==r||(q+r)==p||(r+p)==q);
	}
	
}		