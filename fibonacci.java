import java.util.*;
public class fibonacci
{
	public static void main (String args[])
	{
		int max=10,prev=0,i=0,next=1;
		System.out.println("Fibonacci Series of" +  max  + "numbers:");
		while(i<=max)
		{
			System.out.println(prev +" ");
			int sum=prev+next;
			prev=next;
			next=sum;
			i++;
		}
	}
}