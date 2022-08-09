import jvaa.io.*;
int total,;
string name;
int m1,m2,m3,regno;
class student
{
student(int total,int m1,int m2,int m3,int regno,string name)
{
name=n;
regno=r;
mark1=m1;
mark2=m2;
mark3=m3;
}
void result()
{
total=m1+m2+m3;
}
void print()
{
System.out.println("name"+name);
System.out.println("regno"+regno);
System.out.println("total"+total);
}
public static void main(String args[])throws IOException
{
student dis[]=new student[3];
dis[0]=new student(arun,101,80,85,86);
dis[1]=new student(awsin,102,80,85,86);
dis[2]=new student(bala,103,80,85,86);
dis.print();
dis.result();
}
}