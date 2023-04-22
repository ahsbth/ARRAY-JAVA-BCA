import java.util.*;
import java.io.*;
   class Even_odd
   {
	   public static void main(String args[])
	   {
		   int i,j;
		   int mat[][]=new int[2][3];
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter value for 2*3 matrix =");
		   for(i=0;i<2;i++)
		   {
			   for(j=0;j<3;j++)
			   {
				   mat[i][j]=sc.nextInt();
			   }
		   }
		   System.out.print("even nos from array list=");
		   for(i=0;i<2;i++)
		   {
			   for(j=0;j<3;j++)
			   {
				   if(mat[i][j]%2==0)
				   {
					   System.out.print(mat[i][j]+"\t");
					   
				   }
			   }
		   }
		   System.out.println("Odd no from Array list=");
		   for(i=0;i<2;i++)
		   {
			   for(j=0;j<3;j++)
			   {
				   if(mat[i][j]%2!=0)
				   {
					   System.out.print(mat[i][j]+"\t");
				   }
			   }
		   }
	   }
   }
					   