import java.util.*;
public class recursion
{
	public static void main(String args[])
	{
		int max=10;
		System.out.print("Fibonacci Series of" + max + "number:");
		for(int i=0; i<max; i++)
		{
			System.out.println(FibonRecur(i) + " ");
		}
	}
	public static int FibonRecur(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		return FibonRecur(n-2)+ FibonRecur(n-1);
	}
	
}