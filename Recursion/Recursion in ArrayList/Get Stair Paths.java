1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.
  
Sample Input
                3
Sample Output
               [111, 12, 21, 3]
               
  
  import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> i= getStairPaths(n);
		System.out.println(i);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0)
		{
			ArrayList<String> ans=new ArrayList<String>();
			ans.add("");
			return ans;
		}
		if(n<0)
		{
			ArrayList<String> ans=new ArrayList<String>();
			return ans;
		}
		ArrayList<String> step1=getStairPaths(n-1);
		ArrayList<String> step2=getStairPaths(n-2);
		ArrayList<String> step3=getStairPaths(n-3);
		ArrayList<String> result=new ArrayList<String>();
		String num=Integer.toString(n);
		for(String i:step1)
		{
			
			result.add(1+i);
		}
		for(String i:step2)
		{
		
			result.add(2+i);
		}
		for(String i:step3)
		{
			
			result.add(3+i);
		}
        return result;
    }

}
