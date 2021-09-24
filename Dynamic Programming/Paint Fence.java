import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int ans=paintfence(n,k);
        System.out.println(ans);
    }
    
    public static int paintfence(int fences,int colors)
    {
        int[][] dp=new int[2][fences];
        
        dp[0][1]=colors;
        dp[1][1]=colors*(colors-1);
        
        for(int i=2;i<fences;i++)
        {
            dp[0][i]=dp[1][i-1];
            dp[1][i]=(colors-1)*(dp[0][i-1]+dp[1][i-1]);
        }
        
        return dp[0][fences-1]+dp[1][fences-1];
        
    }
}
