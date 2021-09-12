import java.io.*;
import java.util.*;

public class Main {
     public static void reverse(int[] a){
         int left=0,right=a.length-1;
         while(left<right)
         {
             int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
         }
     }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        // Finding Transpose
        for(int row=0;row<n;row++)
        {
            for(int col=row;col<n;col++)
            {
                // Swap i,j to j,i
                int temp=a[row][col];
                a[row][col]=a[col][row];
                a[col][row]=temp;
            }
        }
        // Reverse each rows
        for(int row=0;row<n;row++)
        {
            reverse(a[row]);
        }
        display(a);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
