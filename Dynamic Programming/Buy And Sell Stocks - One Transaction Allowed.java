import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int ans=buysell(a,n);
        System.out.println(ans);
    }
    
    public static int buysell(int[] a,int n)
    {
        int min=a[0];
        int max_profit=0;
        int curr_profit=0;
        for(int i=1;i<n;i++)
        {
             curr_profit=a[i]-min;
             if(max_profit<curr_profit)
             {
                 max_profit=curr_profit;
             }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        return max_profit;
    }

}
