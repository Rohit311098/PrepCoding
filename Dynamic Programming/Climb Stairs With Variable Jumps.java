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
        
        //int ans1=climbStair(stair,0,n);
        //System.out.println(ans1);
        
        
        //Memoization Method
        //TC- Exponential
        //SC- Constant
        
        /*int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans2=climbStairMem(stair,0,n,dp);
        System.out.println(ans2);*/
        
        
        //Tabulation Method
        int ans3=climbStairTab(stair,n);
        System.out.println(ans3);
    }
    
    public static int climbStair(int[] stair,int idx,int n)
    {
        //Positive Base Case
        if(idx==n)
        {
            return 1;
        }
        
        //Negative Base Case
        if(idx>n)
        {
            return 0;
        }
        int ans=0;
        for(int i=1;i<=stair[idx];i++)
        {
            // Number of calls based on the given value at that particular Stair
            ans+=climbStair(stair,idx+i,n);
        }
        
        return ans;
    }
    public static int climbStairMem(int[] stair,int idx,int n,int[] dp)
    {
        //Positive Base Case
        if(idx==n)
        {
            return 1;
        }
        //Negative Base Case
        if(idx>n)
        {
            return 0;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int ans=0;
        for(int i=1;i<=stair[idx];i++)
        {
            ans+=climbStairMem(stair,idx+i,n,dp);
        }
        dp[idx]=ans;
        return ans;   
    }
    
    public static int climbStairTab(int[] stair,int n)
    {
        
    }

}
