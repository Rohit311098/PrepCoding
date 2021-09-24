import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] maze=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                maze[i][j]=scn.nextInt();
            }
        }
        
        int sr=0,sc=0,dr=n-1,dc=m-1;
        
        
   /*     //Recursion Method
        int ans1=getminpath(sr,sc,dr,dc,maze);
        System.out.println(ans1);*/
        
        
      /* //Memoization Method
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        int ans2=getminpathmem(sr,sc,dr,dc,maze,dp);
        System.out.println(ans2);*/
        
        
        
        //Tabulation Method
        /*
        TC=O(N*M);
        SC=O(N*M);*/
        int ans3=getminpathtab(n,m,maze);
        System.out.println(ans3);
    }
    
    public static int getminpath(int sr,int sc,int dr,int dc,int[][] maze)
    {
        //Negative Base Case
        if(sr>dr || sc>dc)
        {
            return Integer.MAX_VALUE;
        }
        
        //Positive Base Case
        if(sr==dr && sc==dc)
        {
            return maze[sr][sc];
        }
        
        int hmove=getminpath(sr,sc+1,dr,dc,maze);
        
        int vmove=getminpath(sr+1,sc,dr,dc,maze);
        
        int total=maze[sr][sc]+Math.min(hmove,vmove);
        
        return total;
    }
    public static int getminpathmem(int sr,int sc,int dr,int dc,int[][] maze,int[][] dp)
    {
        //Negative Base Case
        if(sr>dr || sc>dc)
        {
            return Integer.MAX_VALUE;
        }
        
        //Positive Base Case
        if(sr==dr && sc==dc)
        {
            dp[sr][sc]=maze[sr][sc];
            return maze[sr][sc];
        }
        if(dp[sr][sc]!=Integer.MAX_VALUE)
        {
            return dp[sr][sc];
        }
        
        int hmove=getminpathmem(sr,sc+1,dr,dc,maze,dp);
        
        int vmove=getminpathmem(sr+1,sc,dr,dc,maze,dp);
        
        int total=maze[sr][sc]+Math.min(hmove,vmove);
        
        dp[sr][sc]=total;
        return total;
    }
    
    public static int getminpathtab(int n,int m,int[][] maze)
    {
        int[][] dp=new int[n][m];
        dp[n-1][m-1]=maze[n-1][m-1];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(i==n-1 && j==m-1)
                {
                    continue;
                }
                else if(i==n-1)
                {
                    dp[i][j]=maze[i][j]+dp[i][j+1];
                }
                else if(j==m-1)
                {
                    dp[i][j]=maze[i][j]+dp[i+1][j];
                }
                else
                {
                    dp[i][j]=maze[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }

}
