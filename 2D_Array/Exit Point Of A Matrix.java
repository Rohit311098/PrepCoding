1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
  
  
  import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int[][] a=new int[n][m];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<m;j++)
	        {
	            a[i][j]=sc.nextInt();
	        }
	    }
	    int row=0,col=0;
	    int dir=0;
	    while(row>=0 && row<n && col>=0 && col<m)
	    {   
	        if(a[row][col]==1)
	        {
	        	dir=(dir+1)%4;
	        }
	            if(dir==0)
	            {
	            	col++;
	            }
	            else if(dir==1)
	            {
	            	row++;
	            }
	            else if(dir==2)
	            {
	            	col--;
	            }
	            else if(dir==3)
	            {
	            	row--;
	            }
	           
	        
	    }
	    if(dir==0)
        {
	    	System.out.println(row);
		    System.out.println(col-1);

        }
        else if(dir==1)
        {
        	System.out.println(row-1);
    	    System.out.println(col);

        }
        else if(dir==2)
        {
        	System.out.println(row);
    	    System.out.println(col++);

        }
        else if(dir==3)
        {
        	System.out.println(row++);
    	    System.out.println(col);
        }
}

}
