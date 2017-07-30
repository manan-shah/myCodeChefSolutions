import java.util.*;
import java.lang.*;

class FLOW006
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
    	int l=a.length();
    	for(int j=0;j<l;j++)
    	{
    	c=c+Character.getNumericValue(a.charAt(j));
    	}
    	System.out.println(""+c);
    }
	}
}