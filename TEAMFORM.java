import java.util.*;
import java.lang.*;
 
class TEAMFORM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int n,m,t;
    t=sc.nextInt();
 
    while(t--!=0)
    {
 
    n=sc.nextInt();
 	m=sc.nextInt();
  for (int i = 0; i < m; i++) {
                sc.nextInt();
                sc.nextInt();
            }
            int r = n-2*m;
           
            if(r%2==0)
            System.out.println("yes");
            else
            System.out.println("no");
	}
}
}