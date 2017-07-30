import java.util.*;
import java.lang.*;
 
class REMISS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int a,b,min,max;
    	a=sc.nextInt();
    	b=sc.nextInt();
    if(a>b)
    min=a;
    else
    min=b;
    
    max = a + b;
    	
    	System.out.println(""+min+" "+max);
    }
	}
}
    	
