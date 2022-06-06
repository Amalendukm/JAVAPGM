import java.util.*;
public class vowels
{
	public static void main(String args [])
	{
		Scanner ob=new Scanner(System.in);
		String str=ob.nextLine();
		System.out.println("Number of vowels in the string:"+CountVowels(str)+"\n");
	}
	public static int CountVowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
}