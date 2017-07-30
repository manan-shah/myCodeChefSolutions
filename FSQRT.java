import java.util.*;
import java.lang.*;
 
class FSQRT
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int a;
    	a=sc.nextInt();
	Double x=Math.sqrt(a);	
    	int c=x.intValue();
    	System.out.println(""+c);
    }
	}
}