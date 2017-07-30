import java.util.*;
import java.io.*;
class MXZERO
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc= new Scanner(System.in);
    int test=Integer.parseInt(sc.nextLine());
    int i,count1;
    while(test>0)
    {
      int n = Integer.parseInt(sc.nextLine());
      String numbers = sc.nextLine();
      count1=0;
      for(i=0;i<numbers.length();i=i+2)
      {
        if(numbers.charAt(i)=='1')
          count1++;
      }
     if(count1%2==0)
       System.out.println(n-count1);
     else
      System.out.println(count1);
      test--;
    }
  }
} 