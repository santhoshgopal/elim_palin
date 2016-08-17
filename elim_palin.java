import java.io.*;
import java.util.*;
class elim_palin
{
public static void main(String args[])
{
int x,i;
ArrayList<Integer>aaa=new ArrayList<Integer>();
Scanner in=new Scanner(System.in);
String a=in.nextLine();
int len=a.length();
StringBuffer as=new StringBuffer(a);
char[] abc=a.toCharArray();
StringBuffer temp=new StringBuffer(a);	
for(i=0;i<len;i++)
{
as.deleteCharAt(i);
		if(as.toString().equals(as.reverse().toString()))
		{
		aaa.add(i);
		}
 as=new StringBuffer(a);
}
for(int aaaa:aaa)
System.out.println(abc[aaaa]);
System.out.println(aaa);
}
}