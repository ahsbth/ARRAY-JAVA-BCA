import java.io.*;
import java.util.*;
  class Dignol
  {
	  public static void main(String args[])
	  {
		  int i,j;
		  int mat[][]=new int[3][3];
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value for 2*3 matrix=");
		  for(i=0;i<3;i++)
		  {
			  for(j=0;j<3;j++)
			  {
				  mat[i][j]=sc.nextInt();
			  }
		  }
		  System.out.println("First dignol value=");
		  for(i=0;i<3;i++)
		  {
			  for(j=0;j<3;j++)
			  {
				  if(i==j)
				  {
					  System.out.print("\t"+mat[i][j]);
				  }
				  System.out.println();
			  }
		  }
		 System.out.println("Second  dignol value=");
		  for(i=0;i<3;i++)
		  {
			  for(j=0;j<3;j++)
			  {
				  if((i+j)==(3-1))
				  {
					  System.out.print("\t"+mat[i][j]);
				  }
				  System.out.println();
			  }
		  }
		
		
	  }
  }
			
			
					  
					  