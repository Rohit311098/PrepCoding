import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception
    {
        // write your code here
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
        int count=0;
        int frow=0,lrow=n-1,fcol=0,lcol=m-1;
        while(count<=n*m)
        {
                  //Left wall
                for(int i=frow;i<=lrow;i++)
                {
                	System.out.println(a[i][fcol]);
                	count++;
                	if(count>=n*m)
                	{
                	    return;
                	}
                }
                fcol++;
                //Bottom wall
                for(int j=fcol;j<=lcol;j++)
                {
                	System.out.println(a[lrow][j]);
                	count++;
                	if(count>=n*m)
                	{
                	    return;
                	}
                }
                lrow--;
                // Right wall
                for(int k=lrow;k>=frow;k--)
                {
                	System.out.println(a[k][lcol]);
                	count++;
                	if(count>=n*m)
                	{
                	    return;
                	}
                }
                lcol--;
                //Top wall
                for(int z=lcol;z>=fcol;z--)
                {
                	System.out.println(a[frow][z]);
                	count++;
                	if(count>=n*m)
                	{
                	    return;
                	}
                }
                frow++;   
        }
    }
}
