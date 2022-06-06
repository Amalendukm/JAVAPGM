import java.util.*;
public class sortarr
{
	public static void main(String args[])
	{
		int[] my_array1={101,234,11,555,107,234,869,367};
		String[] my_array2={"java","python","php","c#","c","c++"};
		System.out.println("original string numeric array:"+ Arrays.toString (my_array1));
		Arrays.sort(my_array1);
		System.out.println("sorted numeric array:"+Arrays.toString(my_array1));
		System.out.println("original sorting array:"+Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("sorted string array:"+Arrays.toString(my_array2));
	}
}
		