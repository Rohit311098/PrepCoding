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
        
        //We cannot do in constant space because there are lots of colour
        int ans=painthouse(a,n,m);
        System.out.println(ans);

    }
    
    public static int smaller(int[] a,int index)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(index!=i)
            {
                min=Math.min(min,a[i]);
            }
        }
        return min;
    }
    public static int painthouse(int[][] a,int n,int m)
    {
         
        int[] color=new int[m];
        for(int i=0;i<m;i++)
        {
            color[i]=a[0][i];
        }
        for(int i=1;i<n;i++)
        {
            int[] newcolor=new int[m];
            for(int j=0;j<m;j++)
            {
                newcolor[j]=smaller(color,j)+a[i][j];
            }
            color=newcolor;
            
        }
        
        int ans=smaller(color,-1);
        
        return ans;
        
    }
}
