import java.util.*;
class Vec
{
public static void main(String args[])
{
Vector v=new Vector();
v.add(10);
v.add(20);
v.add(30);
v.add(40.546);
v.add(12.34);
v.add(1000);
v.addElement("Vector End");
System.out.println("Original Vectore Elements:");
for(int i=0;i<v.size();i++)
{
System.out.print(" " +v.elementAt(i) +" ");
}
System.out.println("Capacity : "+v.capacity());
System.out.println("Contians 20? "+v.contains(20));
System.out.println("Element at 5th location : "+v.elementAt(5));
System.out.println("Element at 2nd index using get() :"+v.get(2));
System.out.println("First Element : "+v.firstElement());
System.out.println("Last element  : "+v.lastElement());
System.out.println("Index of 12.24 : "+v.indexOf(12.24));
System.out.println("Hash Code : "+v.hashCode());
System.out.println("Last index of 20 : "+v.lastIndexOf(20));
System.out.println(v.remove(4));
v.removeElementAt(3);
System.out.println(v.removeAll(v));
System.out.println("Size afert Element revoing :"+v.size());
System.out.println("Is empty Vector:"+v.isEmpty());
System.out.println(v);
}
}

