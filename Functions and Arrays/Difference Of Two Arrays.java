import java.io.*;
import java.util.*;

public class Main{
// a2 is larger than a1
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
	    int n3=n2;
	    int[] ans=new int[n3];
	    int i3=n3-1,i1=n1-1,i2=n2-1;
	    int borrow=0;
	    while(i3>=0)
	    {
	        int l1=(i1>=0) ?a1[i1]:0;
	        int l2= a2[i2];
	         ans[i3]=(l2-borrow)-l1;
	        if(ans[i3]<0)
	        {
	            ans[i3]=ans[i3]+10;
	            borrow=1;
	        }
	        else
	        {
	            borrow=0;
	        }
	        i3--;
	        i2--;
	        i1--;
	    }
	    int z=0;
	    while(ans[z]==0)
	   {
	            z++;
	   }
	       for(int i=z;i<n3;i++)
	        {
	        System.out.println(ans[i]);
	        }
	    }
 }
