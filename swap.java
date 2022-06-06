import java.util.*;
public class swap
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Input a number for A:");
		int a=ob.nextInt();
		System.out.println("Input a number for B:");
		int b=ob.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Number in A:"+a);
		System.out.println("Number in B:"+b);
	}
}