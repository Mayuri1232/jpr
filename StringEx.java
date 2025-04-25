class StringEx
{
public static void main(String args[])
{
String str=" hello java world ";
String str2=" object oriented programming";
System.out.println("Original String :"+str);
System.out.println("String length : "+str.length());
System.out.println("String in Upper Case : "+str.toUpperCase());
System.out.println("Sting in Lower Case : "+str.toLowerCase());
System.out.println("String replace 'j' to 'J' :"+ str.replace('j','J'));
System.out.println("String Trimmed : "+str.trim());
System.out.println("String is Equal or not : "+str.equals(str2));
System.out.println("String is Equal or Not (Ignore Cae ) : "+str.equalsIgnoreCase(str2));
System.out.println("Character At 7 position :"+str.charAt(7));
System.out.println("String Compare  :"+str.compareTo(str2));
System.out.println("String Concate : "+ str.concat(str2));
System.out.println("SubString from 6th pos :"+str.substring(6));
System.out.println("SubString from 6th to 11th pos : "+str.substring(6,11));
System.out.println("Index of 'j' : "+str.indexOf('j'));
System.out.println("index of 3rd pos 'l' : "+str.indexOf('l',3));
}
}