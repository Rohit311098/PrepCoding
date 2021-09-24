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
        
        /*//Recursion Approach
        int ans1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int gold=getgold(i,0,a);
            ans1=Math.max(gold,ans1);
        }
        System.out.println(ans1);*/
        
        /*//Memoization Approach
        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        int ans2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int gold=getgoldMem(i,0,a,dp);
            ans2=Math.max(gold,ans2);
        }
        System.out.println(ans2);*/
        
        
       
        //Tabulation Approach
        //TC-O(N*M)
        //SC- O(N*M)
        int ans3=getgoldtab(a,n,m);
        System.out.println(ans3);
        
    }
    
    public static int getgold(int sr,int sc,int[][] mine)
    {
        if(sr<0 || sr>=mine.length)
        {
            return Integer.MIN_VALUE;
        }
        if(sc==mine[0].length-1)
        {
            return mine[sr][sc];
        }
        
        //faith 1
        int up=getgold(sr-1,sc+1,mine);
        
        //faith 2
        int right=getgold(sr,sc+1,mine);
        
        //faith 3
        int down=getgold(sr+1,sc+1,mine);
        
        //Finding maximum between 3 calls and then adding current cell
        
        
        int total=mine[sr][sc]+Math.max(up,Math.max(right,down));
        
        return total;
        
    }
    public static int getgoldMem(int sr,int sc,int[][] mine,int[][] dp)
    {
        //Negative Base Case
        if(sr<0 || sr>=mine.length)
        {
            return Integer.MIN_VALUE;
        }
        
        //Positive Base Case
        if(sc==mine[0].length-1)
        {
            return mine[sr][sc];
        }
        
        //Checking if we already have answer for it or not
        if(dp[sr][sc]!=Integer.MIN_VALUE)
        {
            return dp[sr][sc];
        }
        
        //faith 1
        int up=getgoldMem(sr-1,sc+1,mine,dp);
        
        //faith 2
        int right=getgoldMem(sr,sc+1,mine,dp);
        
        //faith 3
        int down=getgoldMem(sr+1,sc+1,mine,dp);
        
        //Finding maximum between 3 calls and then adding current cell
        
        int total=mine[sr][sc]+Math.max(up,Math.max(right,down));
        
        //Storing the result
        dp[sr][sc]=total;
        return total;
        
    }
    
    
    
    
    
    
    public static int getgoldtab(int[][] mine,int n,int m)
    {
        int[][] dp=new int[n][m];
        for(int j=m-1;j>=0;j--)
        {
            for(int i=0;i<n;i++)
            {
                if(j==m-1)
                {
                    dp[i][j]=mine[i][j];
                }
                else if(i==0)
                {
                    dp[i][j]=mine[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==n-1)
                {
                    dp[i][j]=mine[i][j]+Math.max(dp[i-1][j+1],dp[i][j+1]);
                }
                else
                {
                    dp[i][j]=mine[i][j]+Math.max(dp[i-1][j+1],Math.max(dp[i][ j+1],dp[i+1][j+1]));
                }
            }
        }
        
        int max_gold=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max_gold=Math.max(max_gold,dp[i][0]);
        }
        return max_gold;
        
    }

}
