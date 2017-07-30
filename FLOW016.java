import java.util.*;
import java.lang.*;
import java.math.*;
 //In this time limit exceeds in codechef refer my another program of FLOW016_1.java
class FLOW016
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t,lcm=0,r;
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int a,b;
    	a=sc.nextInt();
    	b=sc.nextInt();
    for(int i=a;i<=a*b;i++) 
		{
		if(i%a==0 && i%b==0)
		{
		lcm=i;
		break; 
		}
		}
		
	while(b != 0)
            {
                r = a % b;
                a = b;
                b = r;
            }
            
	System.out.println(a+" "+lcm);	
    }
	}
}
