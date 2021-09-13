/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  You can of-course fewer number of steps in the move.
4. You are required to print the number of minimum moves in which you can reach the top of 
     staircase.
Note -> If there is no path through the staircase print null.
Sample Input
n=10
stair[]=3 3 0 2 1 2 4 2 0 0

Sample Ouput-> 4
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] stair=new int[n];
        for(int i=0;i<n;i++)
        {
            stair[i]=sc.nextInt();
        }
        
        //Recursion Method
        //TC- Exponential
        //SC- Constant
        
        int ans1=climbStairMim(stair,0,n);
        System.out.println(ans1);
    }
    public static int climbStairMim(int[] stair,int idx,int n)
    {
        if(idx==n)
        {
            return 1;
        }
        if(idx>n)
        {
            return Integer.MAX_VALUE;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=stair[idx];i++)
        {
            ans=Math.min(ans,climbStairMim(stair,idx+i,n));
        }
        if(ans==Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        
        int total=ans+1;
        return total;
    }

}

