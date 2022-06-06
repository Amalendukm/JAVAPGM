import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		int n,rev=0;
		System.out.println("Enter a number:");
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("Reverse of the number is  "+rev);
	}
}