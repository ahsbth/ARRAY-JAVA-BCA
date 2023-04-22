//import java.util.*;
import java.io.*;
  class Find
  {
	  public static void main(String args[]) throws IOException
	  {
		   int i,sm,gr;
		  int a[]=new int[10];
		 
		 InputStreamReader isr=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(isr);
		
		
		  System.out.println("Enter values=");
		  for(i=0;i<10;i++)
		  {
			   a[i]=Integer.parseInt(br.readLine());
		  }
		  sm=gr=a[0];
		  for(i=0;i<10;i++)
		  {
			  if(a[i]<sm)
			  {
				  sm=a[i];
			  }
			  if(a[i]>gr)
			  {
				  gr=a[i];
			  }
		  }
			System.out.print("Smallest="+sm+"\nGreattest="+gr);  
	  }
  }
		  
			 