//This Question is variation of Fibonacci Number

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
      /*  //Recursion Method
        int ans1=placetile(n);
        System.out.println(ans1);*/
        
       /* // Memoization Method
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans2=placetileMem(n,dp);
        System.out.println(ans2);*/
        
        
        
        //Tabulation Method
        int ans3=placetiletab(n);
        System.out.println(ans3);
    }
    
    public static int placetile(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        //Faith if we place tile horizontally
        int x=placetile(n-2);
        
        //Faith if we place tile vertically
        int y=placetile(n-1);
        
        int ans=x+y;
        
        return ans;
    }
    public static int placetileMem(int n,int[] dp)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        
        //if we already have answer
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        //Faith if we place tile horizontally
        int x=placetileMem(n-2,dp);
        
        //Faith if we place tile vertically
        int y=placetileMem(n-1,dp);
        
        int ans=x+y;
        
        dp[n]=ans;
        return ans;
    }
    
    public static int placetiletab(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
}
