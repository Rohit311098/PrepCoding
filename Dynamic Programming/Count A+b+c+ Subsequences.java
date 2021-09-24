import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
       int ans=printsub(s);
       System.out.println(ans);
    }
    
    public static int printsub(String s)
    {
        int n=s.length();
        int[][] dp=new int[3][n+1];
        
        dp[0][0]=0;
        dp[1][0]=0;
        dp[2][0]=0;
        
        for(int i=1;i<=n;i++)
        {
            if(s.charAt(i-1)=='a')
            {
                dp[0][i]=2*dp[0][i-1]+1;
                dp[1][i]=dp[1][i-1];
                dp[2][i]=dp[2][i-1];
            }
            else if(s.charAt(i-1)=='b')
            {
                dp[0][i]=dp[0][i-1];
                dp[1][i]=dp[0][i]+2*dp[1][i-1];
                dp[2][i]=dp[2][i-1];
            }
            else if(s.charAt(i-1)=='c')
            {
                dp[0][i]=dp[0][i-1];
                dp[1][i]=dp[1][i-1];
                dp[2][i]=dp[1][i]+2*dp[2][i-1];
            }
            else
            {
                dp[0][i]=dp[0][i-1];
                dp[1][i]=dp[1][i-1];
                dp[2][i]=dp[2][i-1];
            }
        }
        return dp[2][n];
        
    }
    
}
