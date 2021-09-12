import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int[] sum=new int[max-min+1];
   for(int i=0;i<arr.length;i++)
   {
       int index=arr[i]-min;
       sum[index]++;
   }
   int[] prefixsum=new int[max-min+1];
   for(int i=0;i<max-min+1;i++)
   {
       if(i==0) prefixsum[i]=sum[i];
       else
       {
           prefixsum[i]=prefixsum[i-1]+sum[i];
       }
   }
   int[] ans=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--)
   {
       int index=arr[i]-min;
       ans[prefixsum[index]-1]=arr[i];
       prefixsum[index]--;
       
   }
   for(int i=0;i<arr.length;i++)
   {
       arr[i]=ans[i];
   }
   
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}
