import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  
   //Recursion Method
    //System.out.println(fibRec(n));
    
    //Memoization Method
    int[] dp=new int[n+1];
   Arrays.fill(dp,-1);
    //System.out.println(fibMem(n,dp));
    
    //Tabulation Method
   System.out.println(fibTab(n));
    
 }
 public static int fibRec(int n)
 {
     if(n==0 || n==1)
     {
         // Because n is 0 or 1 hence we are returning n 
         return n;     
     } 
     int ans=fibRec(n-1)+fibRec(n-2);
     return ans;
 }
 public static int fibMem(int n,int[] dp)
 {
     if(n==0 || n==1)
     {
         return n;
     }
     if(dp[n]!=-1)
     {
         return dp[n];
     }
     dp[n]=fibMem(n-1,dp)+fibMem(n-2,dp);
     return dp[n];
 }
 public static int fibTab(int n)
 {
     int[] dp=new int[n+1];
     dp[0]=0;
     dp[1]=1;
     for(int i=2;i<n+1;i++)
     {
         dp[i]=dp[i-1]+dp[i-2];
     }
     return dp[n];
     
 }

}
