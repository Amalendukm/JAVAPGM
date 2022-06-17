import java.io.*;
class Console
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("co6exp2.txt");
			fw.write("This is experiment2 of CO6");
			fw.close();
			System.out.println("\n File write done");
			char c;
			FileReader fr = new FileReader("co6exp2.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("There are some IOException");
		}
	}
}



OUTPUT
-------

 File write done
This is experiment2 of CO6