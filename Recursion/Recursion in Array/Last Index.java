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
        int x=sc.nextInt();
        //In this approach we traverse from Ending hence it is easy
        System.out.println(lastIndex(arr,n-1,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==-1)
		{
			return idx;
		}
		if(arr[idx]==x)
		{
			return idx;
		}
        int result=lastIndex(arr,idx-1,x);
        return result;
    }

}
