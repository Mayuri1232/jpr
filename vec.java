import java.util.*;
class Vec
{
public static void main(String args[])
{
Vector v=new Vector();
Integer i1=new Integer(10);
Float f1=new Float(13.4);
  String str=new String("Hello");
  v.addElement(i1);
  v.addElement(f1);
  v.addElement(s1);
  v.removeElementAt(1);
  Double d1= new Double(14.5);
  v.insertElementAt(d1,1);
  System.out.println(v);
  v.removeElement(i1);
  System.out.println(v.elementAt(2));
  System.out.println(v.size());
  System.out.println(v.removeAllElement());

  
}
}

