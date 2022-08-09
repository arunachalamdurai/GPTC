import java.io.*;
public class tem
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("enter the temparature");
double cel=Double.parseDouble(in.readLine());
Double far=cel*9.0/5.0+32;
System.out.println("the far is="+far);
}
}