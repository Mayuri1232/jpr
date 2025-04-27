class A extends Thread
{
public void run()
{
for(int i=0;i<=4;i++)
{
System.out.println("From A:"+i);
}
System.out.println("Exit A");
}
}
class B extends Thread
{
public void run()
{
for(int i=4;i>=0;i--)
{
System.out.println("From B:"+i);
}
System.out.println("Exit B");
}
}
class M11
{
public static void main(String args[])
{
A a=new A();
B b=new B();
a.start();
b.start();
System.out.println("Exit Main ");
}
}
