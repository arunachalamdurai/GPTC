import java.io.*;
public class far
{
public static void main(String args[])throws IOException
{
InputStreamReader dis=new InputStreamReader(System.in);
BufferedReader din=new BufferedReader(dis);
System.out.println("enter the celcis");
double cel=Double.parseDouble(din.readLine());
double far=cel*9.0/5.0+32;
System.out.println("far is"+far);
}
}