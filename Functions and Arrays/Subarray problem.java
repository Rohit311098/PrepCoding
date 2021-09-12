import java.io.*;
import java.util.*;

public class Main{
    private static void subarray(int[] a, int n) 
	{
		int start_index=0;
		while(start_index<n)
		{
			int end_index=start_index;
			while(end_index<n)
			{
				for(int j=start_index;j<=end_index;j++)
				{
					System.out.print(a[j]+"	");	
				}
				end_index++;
				System.out.println();
				
			}
			
			start_index++;
		}
		
		
	}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] =sc.nextInt(); 
	    }
	    subarray(a,n);
 }

}
