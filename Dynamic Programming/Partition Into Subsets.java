import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here
        if(n==0 || k==0 || n<k)
        {
            return 0;
        }
        if(k==1 || n==k)
        {
            return 1;
        }
        
        long ans1=k*partitionKSubset(n-1,k);
        
        long ans2=partitionKSubset(n-1,k-1);
        
        return ans1+ans2;
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        /*//Recursion 
        long res = partitionKSubset(n, k);
        System.out.println(res);
        */
        
        //Memoization Method
        long[][] dp=new long[n+1][k+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        long res = partitionKSubsetMem(n, k,dp);
        System.out.println(res);
        
    }
    public static long partitionKSubsetMem(int n, int k,long[][] dp) {
        // write your code here
        if(n==0 || k==0 || n<k)
        {
            return 0;
        }
        if(k==1 || n==k)
        {
            return 1;
        }
        
        if(dp[n][k]!=-1)
        {
            return dp[n][k];
        }
        long ans1=k*partitionKSubsetMem(n-1,k,dp);
        
        long ans2=partitionKSubsetMem(n-1,k-1,dp);
        
        
        dp[n][k]=ans1+ans2;
        
        return ans1+ans2;
        
    }
}
