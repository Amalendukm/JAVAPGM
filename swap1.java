import java.util.*;
public class swap1
{
    	public static void main(String args[]) 
	{
        	int A, B;
  		Scanner in = new Scanner(System.in);
        	System.out.println("Input a number for A:");
        	A = in.nextInt();
        	System.out.println("Input a number for B:");
        	B = in.nextInt();
        	A = A + B;
        	B = A - B;
       	 	A = A - B;
		System.out.println("After Swapping");
        	System.out.println("A = " + A + "\nB = " + B);
    	}
}