import java.util.*;
import java.lang.*;
 
class FLOW002
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int a,b,c;
    	a=sc.nextInt();
    	b=sc.nextInt();
    	c=a%b;
    	System.out.println(""+c);
    }
	}
}
