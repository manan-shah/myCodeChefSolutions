import java.util.*;
import java.lang.*;
 
class PPSUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {int A,B,sum=0;
     		A=sc.nextInt();
            B=sc.nextInt();
            for(int i=0;i<A;i++)
            {
                sum=0;
                for(int j=1;j<=B;j++)
                {
                    sum+=j;
                }
                B=sum; 
            }
            System.out.println(sum);
    }
	}
}