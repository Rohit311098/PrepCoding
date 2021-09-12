import java.io.*;
import java.util.*;

public class Main{
    private static int dectobin(int i) {
		int ans=0,pow=1;
		while(i>0)
		{
			int digit=i%2;
			ans=ans+digit*pow;
			pow*=10;
			i=i/2;
		}
		return ans;
	}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] =sc.nextInt(); 
	    }
	    int range=(int)Math.pow(2, n);
	   for(int i=0;i<range;i++)
	   {
		   int binary=dectobin(i);
		   int div=(int)Math.pow(10,n-1);
		   for(int j=0;j<n;j++)
		   {
			   int quot=binary/div;
			   if(quot%10==1)
			   {
				   System.out.print(a[j]+"	");
			   }
			   else
			   {
				   System.out.print("-	");
			   }
			   div=div/10;
			   
		   }
		   System.out.println();
	   }
 }

}
