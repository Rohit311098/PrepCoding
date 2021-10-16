import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        // //Recursion Approach
        //TC=O(Exponential) SC=Constant
        // int lastcolor=-1;
        // int ans1=painthouse(a,0,m,lastcolor);
        // System.out.println(ans1);
        
        // //Memoization Method
        // int lastcolor=-1;
        // int[][][] dp=new int[n+1][m+1][m+1];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         for(int k=0;k<m;k++)
        //         {
        //             dp[i][j][k]=-1;
        //         }
                
        //     }
        // }
        // int ans2=painthouseMem(a,0,m,lastcolor,dp);
        // System.out.println(ans2);
        
        
      //Tabulation Approach
      //TC=O(N^3) SC=O(N*M);
        int ans3=painthousetab(a,n,m);
        System.out.println(ans3);
    
    
        
        // //We can optimise Above solution by calculating min ans secondmin
        // //and our TC is reduced to O(N^2);
        // int ans4=painthouseopt(a,n,m);
        // System.out.println(ans4);

    }
    public static int painthouse(int[][] a,int index,int m,int lastcolor)
    {
        if(index==a.length)
        {
            return 0;
        }
        
        int ans=Integer.MAX_VALUE;
        //If we are first house
        if(lastcolor==-1)
        {
            for(int j=0;j<m;j++)
            {
                int currans=a[index][j]+painthouse(a,index+1,m,j);
                ans=Math.min(currans,ans);
            }
        
        }
        else
        {
            for(int j=0;j<m;j++)
            {
                if(j!=lastcolor)
                {
                    int curr_ans=a[index][j]+painthouse(a,index+1,m,j);
                    ans=Math.min(ans,curr_ans);
                }
                
            }
        }
        
        return ans;
        
    }
    public static int painthouseMem(int[][] a,int index,int m,int lastcolor,int[][][] dp)
    {
        if(index==a.length)
        {
            return 0;
        }
        
        if(lastcolor!=-1 && dp[index][m][lastcolor]!=-1)
        {
            return dp[index][m][lastcolor];
        }
        
        int ans=Integer.MAX_VALUE;
        //If we are first house
        if(lastcolor==-1)
        {
            for(int j=0;j<m;j++)
            {
                int currans=a[index][j]+painthouseMem(a,index+1,m,j,dp);
                ans=Math.min(currans,ans);
            }
        }
        else
        {
            for(int j=0;j<m;j++)
            {
                if(j!=lastcolor)
                {
                    int curr_ans=a[index][j]+painthouseMem(a,index+1,m,j,dp);
                    ans=Math.min(ans,curr_ans);
                }
                
            }
        }
        
        if(lastcolor!=-1)
        {
            dp[index][m][lastcolor]=ans;
            return ans;
        }
        return ans;
        
    }
     
    public static int painthousetab(int[][] a,int n,int m)
    {
        int[][] dp=new int[n][m];
        for(int i=0;i<m;i++)
        {
            dp[0][i]=a[0][i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=0;k<m;k++)
                {
                    if(k!=j)
                    {
                        dp[i][j]=Math.min(dp[i][j],a[i][j]+dp[i-1][k]);
                    }
                }
            }
        }
        
        int result=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            result=Math.min(result,dp[n-1][i]);
        }
        return result;
    }
    
    public static int painthouseopt(int[][] a,int n,int m)
    {
        int[][] dp=new int[n][m];
        for(int i=0;i<m;i++)
        {
            dp[0][i]=a[0][i];
        }
        for(int i=1;i<n;i++)
        {
            //Calculating Minimum and second minimum for previous  row
            int min=0,secmin=0;
            for(int j=1;j<m;j++)
            {
                if(dp[i-1][min]>=dp[i-1][j])
                {
                    secmin=min;
                    min=j;
                }
                else if(dp[i-1][secmin]>=dp[i-1][j])
                {
                    secmin=j;
                }
            }
            
            //Now calculating which color we have to paint having min cost
            for(int k=0;k<m;k++)
            {
                if(min==k)
                {
                    dp[i][k]=a[i][k]+dp[i-1][secmin];
                }
                else
                {
                    dp[i][k]=a[i][k]+dp[i-1][min];
                }
            }
        }
        
        
        int result=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            result=Math.min(result,dp[n-1][i]);
        }
        return result;
    }
    
    
    
    
    
   
}
