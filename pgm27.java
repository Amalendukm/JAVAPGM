import java.util.*;
public class pgm27
{
	public static void main (String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the 1st string:");
		String str1=ob.nextLine();
		System.out.println("Enter the 2nd string:");
		String str2=ob.nextLine();
		System.out.println("Concatination of string:");
		String str3=str1.concat(str2);
		System.out.println(str3);
		System.out.println("Length of the string:" +str3.length());
		System.out.println("Character at position in 1st string:" +str3.charAt(2));
		System.out.println("Index of character 'n' in 2nd string:" +str2.indexOf('n'));
		System.out.println("convert to Lowercase: "+str3.toLowerCase());
		System.out.println("convert to Uppercase: "+str3.toUpperCase());

	}

}