import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        
        /*//Recursion Method
        
        int ans1=placetile(n,m);
        System.out.println(ans1);
        
        //Memoization Method
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans1=placetileMem(n,m,dp);
        System.out.println(ans1);*/
        
        
        //Tabulation Method
        int ans3=placetiletab(n,m);
        System.out.println(ans3);
        
        
        

    }
    public static int placetile(int n,int m)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        
        //Faith if we place tile horizontally
        int x=0,y=0;
        if(n-m>=0)
        {
             x=placetile(n-m,m);
        }
        
        //Faith if we place tile vertically
        y=placetile(n-1,m);
        int ans=x+y;
        return ans;
    }
    public static int placetileMem(int n,int m,int[] dp)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        
        //if we already have answer
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        //Faith if we place tile horizontally
        int x=0,y=0;
        if(n-m>=0)
        {
             x=placetileMem(n-m,m,dp);
        }
        
        //Faith if we place tile vertically
        y=placetileMem(n-1,m,dp);
        int ans=x+y;
        
        
        dp[n]=ans;
        return ans;
    }
    public static int placetiletab(int n,int m)
    {
      int[] dp=new int[n+1];
      dp[0]=1;
      dp[1]=1;
      
      for(int i=2;i<=n;i++)
      {
          if(i-m>=0)
          {
              dp[i]+=dp[i-m];
          }
          dp[i]+=dp[i-1];
      }
       
       
       return dp[n];
    }
}
