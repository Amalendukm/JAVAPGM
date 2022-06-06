import java.util.Scanner;
import java.lang.Math;
public class amstrng
{
	static void isAmstrong(int n)
	{
		int temp,digits=0,last=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum +=(Math.pow(last,digits));
			temp=temp/10;
		}
		if(n==sum)
		System.out.println("Is Amstrong");
		else
		System.out.println("Is not Amstrong");
	}
	public static void main(String args[])
	{
		int num;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=ob.nextInt();
		isAmstrong(num);
	}
}

		