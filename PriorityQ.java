import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQ
{
public static void main(String args[])
{
int i,n=5;

PriorityQueue<String> pq=new PriorityQueue<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the strings:   ");
for(i=1;i <= n;i++)
{
pq.add(sc.next());
}
System.out.println("Original queue:  " +pq);
pq.remove(4);
System.out.println("After removing: "+pq);
System.out.println("Poll method: "+pq.poll());
System.out.println("Final queue: "+pq);
System.out.println(pq.peek());
}
}

OUTPUT
------

Enter the strings:
WELCOME
JAVA
PROGRAMMING
LANGUAGE
MCA
Original queue:  [JAVA, LANGUAGE, PROGRAMMING, WELCOME, MCA]
After removing: [JAVA, LANGUAGE, PROGRAMMING, WELCOME, MCA]
Poll method: JAVA
Final queue: [LANGUAGE, MCA, PROGRAMMING, WELCOME]
LANGUAGE