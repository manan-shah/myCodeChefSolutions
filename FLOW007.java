import java.util.*;
import java.lang.*;
 
class FLOW007
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int c=0;
    String a;
    	a=sc.next();
    	String reverse = new StringBuffer(a).reverse().toString();
    	int x=Integer.parseInt(reverse);
    	System.out.println(""+x);
    }
	}
}