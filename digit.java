import java.util.*;
import java.io.*;
import java.lang.*;
class digit
{
	public static void main(String args[])
	{
		int sum=0; 
		int temp;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int num=ob.nextInt();
		while(num>0)
		{
			temp=num%10;
			sum=sum+temp;		
			num=num/10;
		}
		System.out.println("Sum of digit="+sum);
	}
}