import java.util.*;
import java.lang.*;
 
class SPALNUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int z,u,c=0; 
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    
    z=sc.nextInt();
 	u=sc.nextInt();
    String a;
    for(int i=z;i<=u;i++)
    {
    	a=Integer.toString(i);
    	String b=new StringBuffer(a).reverse().toString();
    
    	if(a.equals(b))
    	{
    		int x=Integer.parseInt(a);
    		c+=x;
    	}
    	
    }
    System.out.println(""+c);
    c=0;
	}
}
}