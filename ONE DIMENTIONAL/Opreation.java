import java.util.*;
import java.io.*;
   class Opreation
   {
	   public static void main(String args[])
	   {
		   int i,ec=0,oc=0;
		   int a[]=new int[10];
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter 10 nos=");
		   for(i=0;i<10;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   System.out.println("Even no from Array List=");
		   for(i=0;i<10;i++)
		   {
			   if(a[i]%2==0)
			   {
				   ec++;
				   System.out.print(a[i]+"\t");
			   }
		   }
		     System.out.println("odd no from Array List=");
		   for(i=0;i<10;i++)
		   {
			   if(a[i]%2!=0)
			   {
				   oc++;
				   System.out.print(a[i]+"\t");
			   }
		   }
		   System.out.println("No of Even's="+ec+"\nNo of odd's="+oc);
	   }
   }
   