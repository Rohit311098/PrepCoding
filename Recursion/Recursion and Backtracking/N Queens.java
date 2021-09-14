1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get 
more idea.

  
  Sample Input
                  4
Sample Output
                  0-1, 1-3, 2-0, 3-2, .
                  0-2, 1-0, 2-3, 3-1, .
  
  
  
 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[][] a=new int[n][n];
		//boolean[][] visited=new boolean[n][m];
		printNQueens(a,"",0);
        
    }
    public static boolean  isQueenSafe(int[][] chess,int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(chess[i][col]==1)
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
             if(chess[i][j]==1)
            {
                return false;
            }
            
        }
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++)
        {
             if(chess[i][j]==1)
            {
                return false;
            }
            
        }
        return true;
        
    }

    public static void printNQueens(int[][] chess, String ans, int row) {
        if(row==chess.length)
        {
            System.out.println(ans+".");
            return;
        }
        for(int j=0;j<chess[0].length;j++)
        {
            if(isQueenSafe(chess,row,j))
            {
            chess[row][j]=1;
            //faith:row
            printNQueens(chess,ans+row+"-"+j+", ",row+1);
            //backtracking step
            chess[row][j]=0;
            }
        }
        
    }
}
