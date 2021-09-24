import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
      /*  //Recursion Method
        int ans1=friendpair(n);
        System.out.println(ans1);*/
        
        //Memoization Method
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans2=friendpairMem(n,dp);
        System.out.println(ans2);
        
       /* //Tabulation Method
        int ans3=friendpairtab(n);
        System.out.println(ans3);*/
    }
    public static int friendpair(int n)
    {
        if(n==1 ||n==0)
        {
            return 1;
        }
        
        //If friends wants to be single
        int x=friendpair(n-1);
        
        
        //If friend wants to come pair
        //(n-1) is multiplied because we have to make (n-1) calls for (n-2)
        //See Diagram for clearity
        
        int y=(n-1)*friendpair(n-2);
        
        int ans=x+y;
        return ans;
    }
    public static int friendpairMem(int n,int[] dp)
    {
        if(n==1 ||n==0)
        {
            return 1;
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        //If friends wants to be single
        int x=friendpairMem(n-1,dp);
        
        
        //If friend wants to come pair
        //(n-1) is multiplied because we have to make (n-1) calls for (n-2)
        //See Diagram for clearity
        
        int y=(n-1)*friendpairMem(n-2,dp);
        
        int ans=x+y;
        dp[n]=ans;
        return ans;
    }
    
    public static int friendpairtab(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }

}
