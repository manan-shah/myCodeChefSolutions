import java.util.Scanner;
class CANDY123 {
 
	public static void main(String[] args)throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int limak=0, bob=0;
			for(int i=1; ; i++) 
				{
				if(i%2==1)
				limak = limak+i;
				else bob = bob+i;
				if(limak>x) {
					System.out.println("Bob");
					break;
				}
				
				if(bob>y) {
					System.out.println("Limak");
					break;
				}
			}
			
		}
 
	}
 
}