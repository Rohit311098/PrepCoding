Sample Input
5
3 1 0 7 5
Sample Output
3 1 0 7 5
  
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length-1)
	{
		System.out.println(arr[idx]);
		return;
	}
	System.out.println(arr[idx]);
	displayArr(arr,idx+1);
	
        
    }

}
