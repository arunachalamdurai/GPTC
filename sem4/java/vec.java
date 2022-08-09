import java.io.*;
import java.util.*;
public class vec
{
public static void main(String args[])throws IOException
{
Vector dis=new Vector(5,2);
System.out.println("vector size is="+dis.size());
System.out.println("vector capacity is="+dis.capacity());
dis.addElement(3);
System.out.println("vector valu="+dis);
System.out.println("vector size is="+dis.size());
dis.addElement(5);
System.out.println("vector updated valu="+dis);
System.out.println("vector size is="+dis.size());
dis.removeElement(3);
System.out.println("vector valu="+dis);
System.out.println("vector size is="+dis.size());
dis.addElement("good");
System.out.println("vector valu="+dis);
System.out.println("vector size is="+dis.size());
dis.removeAllElements();
System.out.println("vector after removed all elements the status of valu="+dis);
System.out.println("vector after removed all elements size is="+dis.size());
}
}