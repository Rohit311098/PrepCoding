import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int counter) {
        // write ur code here
       if(idx==arr.length)
        {
            int[] a=new int[counter];
            return a;
        }
        if(arr[idx]==x)
        {
            counter++;
        }
        int[] result=allIndices(arr,x,idx+1,counter);
        if(arr[idx]==x)
        {
        	result[counter-1]=idx;
        }
		return result;
        
    }

}
