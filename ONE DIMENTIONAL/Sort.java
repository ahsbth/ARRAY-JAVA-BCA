import java.util.*;
import java.io.*;
  class Sort
  {
	  public static void main(String args[]) throws IOException
	  {
		  int i,j,temp;
		  int a[]=new int[10];
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.print("Enter 10 nos for Sort=");
		  for(i=0;i<10;i++)
		  {
			  a[i]=Integer.parseInt(br.readLine());
		  }
		  System.out.println("Before Sorting=");
		  for(i=0;i<10;i++)
		  {
			  System.out.print(a[i]+"\t");
		  }
		  for(i=0;i<10;i++)
		  {
			  for(j=0;j<10;j++)
			  {
				  if(a[i]<a[j])
				  {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
			  System.out.println("After sorting Array's are=");
			  for(i=0;i<10;i++)
			  {
				  System.out.print(a[i]+"\t");
			  }
		  }
	  }
  
  
				  