import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        //Memoization Method
        int[][] dp=new int[n+1][2];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        int lasttaken=0;
        int ans1=maxsum(a,0,lasttaken,dp);
        System.out.println(ans1);

    }
    public static int maxsum(int[] a,int idx,int lasttaken,int[][] dp)
    {
        if(idx>=a.length)
        {
            return 0;
        }
        if(dp[idx][lasttaken]!=-1)
        {
            return dp[idx][lasttaken];
        }
        
        if(lasttaken==1)
        {
            int ans=maxsum(a,idx+1,0,dp);
            dp[idx][lasttaken]=ans;
            return ans;
        }
        
        int ansYes=a[idx]+maxsum(a,idx+1,1,dp);
        int ansNo=maxsum(a,idx+1,0,dp);
        
        int ans=Math.max(ansYes,ansNo);
        dp[idx][lasttaken]=ans;
        return ans;
    }
}
