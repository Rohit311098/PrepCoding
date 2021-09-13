/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.



Sample Input
n=10
3 3 0 2 1 2 4 2 0 0
    
Sample Output
5
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
        //TC-O(N);
       // SC-O(N);
       
       
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
        
        //Checking if we already traverse the stair or not
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int ans=0;
        for(int i=1;i<=stair[idx];i++)
        {
            ans+=climbStairMem(stair,idx+i,n,dp);
        }
        //Saving the result so that we don't traverse it again
        dp[idx]=ans;
        return ans;   
    }
    
    public static int climbStairTab(int[] stair,int n)
    {
        
        int[] dp=new int[n+1];
        //Because in our base case we  have 1 possibility hence in dp[n]=1 is there
        dp[n]=1;
        
        for(int i=n-1;i>=0;i--)
        {
            // j loop decide how many steps we can take based on stair number
            for(int j=1;j<=stair[i];j++)
            {
                //We have to check if we go over the top
                if(i+j<=n)
                {
                    dp[i]+=dp[i+j];
                }
            }
        }
        return dp[0];
    }

}
