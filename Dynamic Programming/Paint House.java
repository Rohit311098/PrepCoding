import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        //We are using 6 pointers for answer
        int ans=painthouse(a,n);
        System.out.println(ans);
    }
    
    public static int painthouse(int[][] a,int n)
    {
        int x=a[0][0];
        int y=a[0][1];
        int z=a[0][2];
        
        for(int i=1;i<n;i++)
        {
            int newx,newy,newz;
            
            newx=Math.min(y,z)+a[i][0];
            
            newy=Math.min(x,z)+a[i][1];
            
            newz=Math.min(x,y)+a[i][2];
            
            x=newx;
            y=newy;
            z=newz;
        }
        
        int ans=Math.min(x,Math.min(y,z));
        
        return ans;
        
    }
}
