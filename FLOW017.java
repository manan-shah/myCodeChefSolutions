	
		
			
import java.util.*;
import java.lang.*;
 
class FLOW017
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
    	c=sc.nextInt();
    int[] x={a,b,c};
    Arrays.sort(x);
    	
    	System.out.println(""+x[1]);
    }
	}
}
