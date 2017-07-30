import java.util.*;
import java.lang.*;
 
class SNELECT
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    int t; 
    t=sc.nextInt();
 
    while(t--!=0)
    {
    int s=0,m=0,streak,kills=0;
    String a;
    	a=sc.next();
    	int l=a.length();
    //	l-=1;
    	char snake='s',mangus='m';
    	
    	for(int i=0;i<l;i++)
    	{
    		if(a.charAt(i)==snake)
    		s++;
    		if(a.charAt(i)==mangus)
    		m++;
    	}	
    		
    	for(int i=1; i<l;i++) {
                if(!(a.charAt(i)==a.charAt(i-1))) {
                    kills++;
                    ++i;
                }
            }
            s-=kills;
    		
    		if(s<m){
            System.out.println("mongooses");
        }
        else if(s>m){
            System.out.println("snakes");
        }
        else{
            System.out.println("tie");
        }
    	}
    
  
    		
        
    	/*4
		sm
		ssm
		sms
		ssmmmssss
		*/
    
    }
}