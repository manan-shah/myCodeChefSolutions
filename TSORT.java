import java.util.*;
import java.lang.*;

class TSORT 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int a[] = new int[t];
        for(int i = 0; i < t ; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
         for(int i = 0; i < t ; i++)
        {
        System.out.println(a[i]);
        }
    }
}