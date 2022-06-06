import java.util.Scanner;
class Username extends Exception
{
	public Username(String msg)
	{
		super(msg);
		
	}
}
class Password extends Exception 
{
	public Password(String msg)
	{
		super(msg);
	}
}
public class CheckLogin
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		String username,password;
		System.out.println("Enter username:");
		username=s.nextLine();
		System.out.println("Enter the password:");
		password=s.nextLine();
		int length=username.length();
		try
		{
			if(length < 6)
				throw new Ysername('Username must be greater than 6 characters");
			elseif(!password.equals("hello"))
				throw new Password("Incorrect password \n Type correct password");
			else
				System.out.println("Login Successful");
