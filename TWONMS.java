import java.util.*;
import java.lang.*;
 
class TWONMS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int a,b,n;
    	a=sc.nextInt();
    	b=sc.nextInt();
		n=sc.nextInt();
    	
 
        if(n%2!=0)
        {
            a *= 2;
            int z = Math.max(a,b)/Math.min(a,b);
           System.out.println(z);
        }
        else if(n%2==0)
        {
             int z = Math.max(a,b)/Math.min(a,b);
           System.out.println(z);
        }
    }
	}
}