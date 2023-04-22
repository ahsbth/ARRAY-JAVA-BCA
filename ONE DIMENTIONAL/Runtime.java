import java.util.*;
import java.io.*;
  class Runtime
  {
	  public static void main(String args[]) throws IOException
	  {    
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		   int i,sz; System.out.println("Enter size of array=");
		   sz=Integer.parseInt(br.readLine());
		  int a[]=new int[sz];
		 
		
		
		  System.out.println("Enter values=");
		  for(i=0;i<sz;i++)
		  {
			   a[i]=Integer.parseInt(br.readLine());
		  }
		  System.out.println("Values are");
		  for(i=0;i<sz;i++)
		  {
			  System.out.print(""+a[i]);
		  }
	  }
  }
		  
			 