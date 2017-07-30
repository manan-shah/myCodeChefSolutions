import java.util.*;
class BRACKETS
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=1;i<=t;i++)
{
String s=sc.next();
int l=s.length();
int m=0,max=0;
for(int j=0;j<l;j++)
{
if(s.charAt(j)=='(')
m++;
else if(s.charAt(j)==')')
m--;
max=Math.max(max,m);
}
for(int j=0;j<max;j++)
{
System.out.print("(");
}
for(int j=0;j<max;j++)
{
System.out.print(")");
}
System.out.println();
}
}
} 