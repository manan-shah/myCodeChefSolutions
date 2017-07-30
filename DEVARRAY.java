import java.util.*;

class DEVARRAY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		int z[]=new int[q];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int min=a[0];
		int max=a[n-1];
		for(int i=0;i<q;i++){
			z[i]=sc.nextInt();
			if(z[i]>=min && z[i]<=max)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
} 