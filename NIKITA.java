import java.lang.*;
import java.io.*;
import java.util.*;

class Nikita
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);
		String n;
		int i=0;
		int r;
	r=Integer.parseInt(br.readLine());
	
	for (i=0;i<r;i++)
	{
	n=br.readLine();
	String[] t = n.split(" ");
	if(t.length==1)
	    System.out.println(t[0].substring(0, 1).toUpperCase() + t[0].substring(1).toLowerCase());
	if(t.length==3)
	    System.out.println(t[0].substring(0, 1).toUpperCase()+". "+t[1].substring(0, 1).toUpperCase()+". "+t[2].substring(0, 1).toUpperCase() + t[2].substring(1).toLowerCase());
	if(t.length==2)
	    System.out.println(t[0].substring(0, 1).toUpperCase()+". "+t[1].substring(0, 1).toUpperCase() + t[1].substring(1).toLowerCase());
	}
	}
}
