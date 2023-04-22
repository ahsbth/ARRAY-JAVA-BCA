//import java.io.*;
import java.util.*;
  class Disparray
  {
	  public static void main(String args[]) 
	  {
		 int a[]=new int[10];
		  int i;
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter 10 values=");
		  for(i=0;i<10;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.println("The values that are Entered you is Following=");
		  for(i=0;i<10;i++)
		  {
			  System.out.print(a[i]+"\t");
		  }
	  }
  }
		 
	  