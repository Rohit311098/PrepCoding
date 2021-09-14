/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  You can of-course fewer number of steps in the move.
4. You are required to print the number of minimum moves in which you can reach the top of 
     staircase.
Note -> If there is no path through the staircase print null.
Sample Input
n=10
stair[]=3 3 0 2 1 2 4 2 0 0

Sample Ouput-> 4
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] stair=new int[n];
        for(int i=0;i<n;i++)
        {
            stair[i]=sc.nextInt();
        }
        
        //Recursion Method
        //TC- Exponential
        //SC- Constant
        
        /*int ans1=climbStairMim(stair,0,n);
        if(ans1==Integer.MAX_VALUE)
        {
            System.out.println("Null");
            return; 
        }
        System.out.println(ans1);*/
        
        //Memoization Method
        //TC- Exponential
        //SC- O(N)
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        //int ans2=climbStairMimMem(stair,0,n,dp);
       // System.out.println(ans2);
        
        //Tabulation Method
        int ans3=ClimbStairMimTab(stair,n);
        //System.out.println(ans3);
        
    }
    public static int climbStairMim(int[] stair,int idx,int n)
    {
        if(idx==n)
        {
            // If we are at last stair and want to go to last stair then there are no way you can go with mandatory jumps, hence we are returning zero(i.e 
            // it means don't jump you are at final stair)
            return 0;
        }
        //Negative base case
        if(idx>n)
        {
            return Integer.MAX_VALUE;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=stair[idx];i++)
        {
            ans=Math.min(ans,climbStairMim(stair,idx+i,n));
        }
        if(ans==Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        
        int total=ans+1;
       
        return total;
    }
    public static int climbStairMimMem(int[] stair,int idx,int n,int[] dp)
    {
        if(idx==n)
        {
            return 0;
        }
        if(idx>n)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=stair[idx];i++)
        {
            ans=Math.min(ans,climbStairMimMem(stair,idx+i,n,dp));
        }
        if(ans==Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        
        int total=ans+1;
        dp[idx]=total;
        return total;
    }
    public static int ClimbStairMimTab(int[] stair,int n)
    {
        int[] dp=new int[n+1];
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=stair[i];j++)
            {
                if(dp[i+j]<=n)
                {
                    dp[i]=Math.min(ans,1+dp[i+j]);
                }
            }

            
        }
       /*  for(int i=0;i<=n;i++)
        {
            System.out.println(i+"--->"+dp[i]);
        }
        */
        return dp[0];
    }

}






