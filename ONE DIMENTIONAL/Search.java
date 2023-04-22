import java.io.*;
import java.util.*;
  class Search
  { 
     public static void main(String args[])
	 {
		 int i,sn,p=0;
		 int a[]=new int[10];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 10 nos=");
		 for(i=0;i<10;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("Enter no for search=");
		 sn=sc.nextInt();
		 for(i=0;i<10;i++)
		 {
			 if(sn==a[i])
			 {
				 p=1;
				 break;
			 }
		 }
		 if(p==1)
		 {
			 System.out.println("No is found");
		 }
		 else
		 {
			 System.out.println("No is not found");
		 }
	 }
  }
		 