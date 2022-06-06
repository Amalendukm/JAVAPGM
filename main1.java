import java.util.*;
public class main1
{
	public static void main(String args[])
	{
		String test="Hai Amalendu .@.123!!";
		count(test);
	}
	public static void count(String x)
	{
		char[] ch=x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0; i<x.length(); i++)
		if(character.isLetter (ch[i]))
		{
			letter ++;
		}
		else if(character.isDigit (ch[i]))
		{
			digit ++;
		}
		else if(character.isSpaceChar(ch[i]))
		{
			space ++;
		}
		else
		{
			other ++;
		}
	}
	System.out.println("letter:" +letter);
	System.out.println("number:" +num);
	System.out.println("other:" +other);
}