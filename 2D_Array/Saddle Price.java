1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
  
  
  
  
  
  import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
        	int min=Integer.MAX_VALUE;
        	int col=0,row=0;
        	for(int j=0;j<n;j++)
        	{
        		if(a[i][j]<min)
        		{
        			min=a[i][j];
        			col=j;
        		}
        	}
        	int max=Integer.MIN_VALUE;
        	for(int j=0;j<n;j++)
        	{
        		if(max<a[j][col])
        		{
        			max=a[j][col];
        			row=j;
        		}
        	}
        	
        	if(row==i)
        	{
        		System.out.println(a[row][col]);
        		return;
        	}
        	
        }
        	System.out.println("Invalid input");
        
    }

}
