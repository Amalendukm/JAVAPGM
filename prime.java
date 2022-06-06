import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int i,count;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the 1st limits:");
		int m=ob.nextInt();
		System.out.println("Enter the 2nd limits:");
		int n=ob.nextInt();
		System.out.println(" Prime numbers between " + m  + "to" + n + "are");
		for(int j=m;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			System.out.println(j+ " ");
		}
	}
}
		
		