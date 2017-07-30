import java.util.*;
 
 class UTMOPR{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 0; test < t; test++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += sc.nextInt();
				sum %= 2;
			}
			if (k == 1) {
				System.out.println(sum == 1 ? "even" : "odd");
			} else {
				System.out.println("even");
			}
		}
		
	}
} 