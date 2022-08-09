import java.io.*;
public class large
{
public static void main(String args[])throws IOException
{
int f,s,large;
DataInputStream din=new DataInputStream(System.in);
System.out.println("enter the frist number");
f=Integer.parseInt(din.readLine());
System.out.println("enter the second number");
s=Integer.parseInt(din.readLine());
large=f>s?f:s;
System.out.println("the large number is="+large);
}
}