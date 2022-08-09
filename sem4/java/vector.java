import java.io.*;
import java.util.*;
public class vector
{
public static void main(String args[])throws IOException
{
Vector dis= new Vector(5,2);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
dis.addElement(1);
System.out.println("added element is "+dis);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
dis.addElement(3);
System.out.println("added element is "+dis);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
dis.addElement("good");
System.out.println("added element is "+dis);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
dis.removeElement(3);
System.out.println("after removed the element "+dis);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
dis.insertElementAt("s",1);
System.out.println("after inserted element "+dis);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
dis.removeAllElements();
System.out.println("after removed all elements "+dis);
System.out.println("capacity is "+dis.capacity());
System.out.println("size is "+dis.size());
}
}