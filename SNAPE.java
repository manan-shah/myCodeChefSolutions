 
import java.util.*;
import java.lang.*;
import java.io.*;
 

class SNAPE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	     for (int i=0 ; i<t ;i++)
	     {
	       int a ,b ,c ,d ;
	       
	       a = sc.nextInt();
	       b = sc.nextInt();
	       
	       c = (b*b)-(a*a);
	       d = (a*a)+(b*b);
	       
	       Double x=Math.sqrt(c);	
    	    float e =x.floatValue();
    	    
    	    
    	    
    	    Double k=Math.sqrt(d);	
    	    float l =k.floatValue();
    	     
    	     System.out.println(e+" "+l);
            	         
	         
	     }
	     
	     
	     
	}
}