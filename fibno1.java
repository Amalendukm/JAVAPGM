import java.util.*;
public class fibno1
{
	public static void main(String args[])
	{
		int max=0,prev=0,next=1;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the limit:");
		max=ob.nextInt();
		System.out.println("Fibonacci Series of "+max + "numbers:");
		for(int i=1; i<=max; i++)
		{
			System.out.println(prev + " ");
			int sum = prev+next;
			prev=next;
			next=sum;
		}
	}
}
			