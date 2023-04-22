import java.util.*;
import java.io.*;
   class Find
   {
	   public static void main(String args[])
	   {
		   int i,j,sm,gr;
		   int mat[][]=new int[3][4];
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter value for 3*4 matrix=");
		   for(i=0;i<3;i++)
		   {
			   for(j=0;j<4;j++)
			   {
				   mat[i][j]=sc.nextInt();
			   }
		   }
		   sm=gr=mat[0][0];
		   for(i=0;i<3;i++)
		   {
			   for(j=0;j<4;j++)
			   {
				   if(mat[i][j]>gr)
				   {
					   gr=mat[i][j];
				   }
				   if(mat[i][j]<sm)
				   {
					   sm=mat[i][j];
				   }
			   }
		   }
		   System.out.println("Smallest="+sm+"\tGreattest="+gr);
	   }
   }
   
					
		   