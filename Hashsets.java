import java.util.HashSet;
import java.util.Scanner;

public class Hashsets
{
public static void main(String args[])
{
int i,n=5;

HashSet<Integer> hs1=new HashSet<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the firsthashset");
for(i=1;i <= n;i++)
{
hs1.add(sc.nextInt());
}
System.out.println("firsthash set:" +hs1);

//second hashset

HashSet<Integer> hs2=new HashSet<Integer>();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the second hashset");
for(i=1;i <= n;i++)
{
hs2.add(sc1.nextInt());
}
System.out.println("second hash set:" +hs2);
System.out.println("first hashset is equal to second hashset:   " +hs1.equals(hs2));

//remove
hs2.remove(2);
System.out.println("second hashset after removing an element:  " +hs2);
System.out.println("first hashset is equal to second hashset:   " +hs1.equals(hs2));



}
}


OUTPUT
-------

Enter the firsthashset
1
2
3
4
5
firsthash set:[1, 2, 3, 4, 5]
Enter the second hashset
1
2
3
4
5
second hash set:[1, 2, 3, 4, 5]
first hashset is equal to second hashset:   true
second hashset after removing an element:  [1, 3, 4, 5]
first hashset is equal to second hashset:   false