import java.util.*;
import java.io.*;
  class Matrix
  {
	  public static void main(String args[])
	  {
		  int i,j;
		  int mat[][]=new int[2][3];
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value for 2*3 matrix=");
		  for(i=0;i<2;i++)
		  {
			  for(j=0;j<3;j++)
			  {
				  mat[i][j]=sc.nextInt();
			  }
		  }
		  System.out.println("Matrix value=");
		    for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(mat[i][j]+"\t");
				}
				System.out.println();
			}
	  }
  }
  
  