import java.util.*;
import java.lang.*;
import java.math.*;
 
class FLOW016_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t;
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int x,y;
    x=sc.nextInt();
    y=sc.nextInt();
    BigInteger a,b,l,g;
    	a=BigInteger.valueOf(x);
    	b=BigInteger.valueOf(y);
    //l=a.lcm(b);
    g=a.gcd(b);
    
   l=(a.multiply(b)).divide(g);
	
	System.out.println(g+" "+l);	
    }
	}
}
