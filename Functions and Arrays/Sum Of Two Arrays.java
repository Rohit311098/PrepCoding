import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int[] a2=new int[n2];
    for(int i=0;i<n2;i++)
    {
        a2[i]=sc.nextInt();
    }
    int n3=Math.max(n1,n2)+1;
    int[] ans=new int[n3];
    int k=n3-1,i=n1-1,j=n2-1;
    int carry=0;
    while(k>=0)
    {
        int l1= (i>=0) ? a1[i]:0;
        int l2= (j>=0) ? a2[j]:0;
        int sum=l1+l2+carry;
        ans[k]=sum%10;
        carry=sum/10;
        
        i--;
        j--;
        k--;
    }
    
    for(int z=0;z<n3;z++)
    {
        if(z==0 && ans[z]==0)
        {
            continue;
        }
        System.out.println(ans[z]);
    }
 }

}
