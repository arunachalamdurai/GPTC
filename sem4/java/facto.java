import java.io.*;
public class facto
{
public static void main(String args[])throws IOException
{
int a,b=1;
DataInputStream din=new DataInputStream(System.in);
System.out.println("enter the number");
a=Integer.parseInt(din.readLine());
for(int i=1;i<=a;i++)
{
b=(b*i);
}
System.out.println("fatorial number is="+b);
}
}