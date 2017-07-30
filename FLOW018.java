import java.io.*;
import java.lang.*;

class FLOW018{  
 static int fact(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * fact(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1,iterations=0,number=0;
  
   InputStreamReader ir = new InputStreamReader(System.in);
   BufferedReader br= new BufferedReader(ir);
   
  try{iterations=Integer.parseInt(br.readLine());}catch(IOException e){
  e.printStackTrace();
}
  
  for(i=0;i<iterations;i++)
  {
  try{number=Integer.parseInt(br.readLine());}catch(IOException e){
  e.printStackTrace();
}
  fact = fact(number);   
  System.out.println(""+fact);    
  } 
 }  
}  