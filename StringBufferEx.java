class StringBufferEx
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer(" Object Language ");
System.out.println("Original String:" +str);
System.out.println("Length of String : "+str.length());
for(int i=0;i<str.length();i++)
{
System.out.print(" "+str.charAt(i));
}
System.out.println(" ");
int pos =str.indexOf(" Language ");
str.insert(pos," oriented");
System.out.println(" Insert 'oriented' at position of language:");
System.out.println("Modified String :"+str);
System.out.println(" Setting '_' at 7 th position :");
str.setCharAt(7,'_');
System.out.println(str);
System.out.println("Appending a 'improves security' at end of string : ");
str.append(" Improves Security");
System.out.println("Modified String :"+str);
}
}