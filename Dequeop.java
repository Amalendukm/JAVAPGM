import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Dequeop
{
public static void main(String args[])
{
int i,n=5;

Deque<String>dq=new ArrayDeque<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
for(i=1;i <= n;i++)
{
dq.add(sc.next());
}
System.out.println("Strings are:\n" +dq);
System.out.println("pop element\n" +dq.pop());
System.out.println("poll element\n" +dq.poll());
System.out.println("poll first element\n" +dq.pollFirst());
System.out.println("poll last element\n" +dq.pollLast());
}
}

OUTPUT
-------

Enter the string
HELLO
WORLD
JAVA
PROGRAMS
SCIENCE
Strings are:
[HELLO, WORLD, JAVA, PROGRAMS, SCIENCE]
pop element
HELLO
poll element
WORLD
poll first element
JAVA
poll last element
SCIENCE