import java.util.*;
public class palindrome
{
	public satic void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=ob.nextLine();
		int size=str.length();
		boolean is palindrome=true;
		for(int i=0;i<size/2;i++)
		{
			if(str.charAt(i)==str.charAt(size-i-1))
			continue;
			else
			{
				ispali