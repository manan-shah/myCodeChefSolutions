import java.util.*;
import java.lang.*;

class FLOW004
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
    
    while(t--!=0)
    {
    int c=0,d=0;
    String a;
    	a=sc.next();
    	int l=a.length();
    	l-=1;
    	int first,last,sum;
    
    	first=Character.getNumericValue(a.charAt(0));
    	last=Character.getNumericValue(a.charAt(l));
    	sum=first+last;
    	System.out.println(""+sum);
    }
	}
}