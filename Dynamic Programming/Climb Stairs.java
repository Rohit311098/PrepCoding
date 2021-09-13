import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //Recursion Method
        
        //TC- Exponential
        //SC- Constant
        // System.out.println(climbStair(0,n));
        
        
        //Memoization Method
        
        //TC-Exponential (But we are reducing the calls by storing the result)
        //TC- O(N+1);
        
        
       /* int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climbStairMem(0,n,dp));*/
        
        
        //Tabulation Method
        
       // TC-0(N+1)
        //SC-O(N+1);
        System.out.println(climbStairTab(n));
        
    }
    public static int climbStair(int curr,int n)
    {
        //Negative Base Case
        if(curr>n)
        {
            return 0;
        }
        
        //Positive Base Case
        if(curr==n)
        {
            return 1;
        }
        
        //If we take one stair
        int ans1=climbStair(curr+1,n);
        
         //If we take two stair
        int ans2=climbStair(curr+2,n);
        
         //If we take three stair
        int ans3=climbStair(curr+3,n);
        
        int total=ans1+ans2+ans3;
        
        return total;
    }
    public static int climbStairMem(int curr,int n,int[] dp)
    {
        //Negative Base Case
        if(curr>n)
        {
            return 0;
        }
        
        //Positive Base Case
        if(curr==n)
        {
            return 1;
        }
        
        //We cancelling the call for which we already calcualted the result
        if(dp[curr]!=-1)
        {
            return dp[curr];
        }
        
        
        //Calls if we climb 1,2,3 stairs
        int ans1=climbStairMem(curr+1,n,dp);
        int ans2=climbStairMem(curr+2,n,dp);
        int ans3=climbStairMem(curr+3,n,dp);
        
        //Calculating total path if we take 1,2,3 stair from same point is sum of all calls
        int total=ans1+ans2+ans3;
        
        //We Store the result in dp array to avoid duplicate calls
        dp[curr]=total;
        return total;
    }
    
    public static int climbStairTab(int n)
    {
        int[] dp=new int[n+1];
        
        //Base Case or Smaller Problem
        dp[n]=1;
        
        //Iterating backwords
        for(int i=n-1;i>=0;i--)
        {
            int ans=dp[i+1];
            if(i+2<=n)
            {
                ans+=dp[i+2];
            }
            if(i+3<=n)
            {
                ans+=dp[i+3];
            }
            dp[i]=ans;
        }
        return dp[0];
    }

}
