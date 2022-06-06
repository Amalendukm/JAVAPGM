import java.util.*;
public class mul
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=ob.nextInt();
		for(int i=1; i<11; i++)
		{
			System.out.println(i + "*" + num +"=" + (i*num));
		}
	}
}

		