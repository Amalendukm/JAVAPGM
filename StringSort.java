import java.util.*;
class StringSort
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		int max = Integer.parseInt(ob.nextLine());
		String[] str = new String[max];
		System.out.println("Enter the string:");
		for(int i=0; i<max; i++)
		{
			str[i]=ob.nextLine();
		}
		System.out.println("Before Sort:");
		System.out.println(Arrays.toString(str) );
		Arrays.sort(str);
		System.out.println("After Sort:");
		System.out.println(Arrays.toString(str) );
	}
}
			