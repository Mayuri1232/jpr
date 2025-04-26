class WrapperEx
{
public static void main(String args[])
{
//Integer Wrapper class
int i=20;
long l=120001;
Integer i1=new Integer(i);
Long l1=new Long(l);
int i2=i1.intValue();
long l2=l1.longValue();
//print "object to primitive"
String str=Integer.toString(i);
String str2=Long.toString(l);
//print "integer/long to string"
int i4=Integer.parseInt(str);
long l4=Long.parseLong(str2);
//print "numeric string to primitive"

//String value into Integer class
int i3=10;
String str1="123";
int intvalue=Integer.valueOf(str1);
System.out.println("string value:"+str);
System.out.println("Integer object:"+intvalue);

//Character Wrapper class
System.out.println(Character.isLetter('A'));
System.out.println(Character.isDigit('0'));
System.out.println(Character.isUpperCase('A'));
System.out.println(Character.isLowerCase('A'));
System.out.println(Character.toString('A'));

}
}
