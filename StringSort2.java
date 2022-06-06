import java.util.*;
class StringSort2
{
	public static void main(String args[])
	{
		Scanner ob =new Scanner (System.in);
		String temp;
		System.out.println("Enter the number of strings:");
		int max =Integer.parseInt(ob.nextLine());
		String[] str = new String[max];
		System.out.println("Enter the strings:");
		for(int i=0; i<max; i++)
		{
			str[i] = ob.nextLine();
		}
		System.out.println("Before Sort:");
		System.out.println(Arrays.toString(str));
		for(int i=0; i< max; i++)
		{	
			for(int j=i+1; j<max; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("After Sort:");
		System.out.println(Arrays.toString(str));
	}
}
				
		
		