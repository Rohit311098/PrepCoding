1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps 
   diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.
  
  
Sample Input
2
2
Sample Output
[h1v1, v1h1, d1]



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		ArrayList<String> ans=getMazePaths(0,0,n-1,m-1);
		System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc)
    	{
    		ArrayList<String> ans=new ArrayList<String>();
    		ans.add("");
    		return ans;
    	}
    	if(sr>dr || sc>dc)
    	{
    		ArrayList<String> ans=new ArrayList<String>();
    		return ans;
    	}
    	
    	
    	
    	
    	ArrayList<String> result=new ArrayList<String>();
    	for(int i=1;sc+i<=dc;i++)
    	{
    		ArrayList<String> faith1=getMazePaths(sr,sc+i,dr,dc);
	    	for(String s: faith1)
	    	{
	    		result.add("h"+i+s);
	    	}
    	}
    	
    	
    	for(int i=1;sr+i<=dr;i++)
    	{
    		ArrayList<String> faith2=getMazePaths(sr+i,sc,dr,dc);
	    	for(String s: faith2)
	    	{
	    		result.add("v"+i+s);
	    	}
    	}
    	
    	
    	for(int i=1;sr+i<=dr && sc+i<=dc;i++)	
    	{
    		ArrayList<String> faith3=getMazePaths(sr+i,sc+i,dr,dc);
	    	for(String s: faith3)
	    	{
	    		result.add("d"+i+s);
	    	}
    	}
    
        return result;
    }

}
