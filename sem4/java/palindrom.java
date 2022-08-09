import java.io.*;
public class palindrom
{
public static void main(String args[])throws IOException
{
String s2,s;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("give the string");
s=dis.readLine();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
s2=s.toString();
if(s.equals(s2))
{
System.out.println("given string is palindrom");
}
else
{
System.out.println("given string is not a palindrom");
}
}
}
