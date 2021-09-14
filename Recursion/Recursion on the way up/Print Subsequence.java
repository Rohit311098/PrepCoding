1. You are given a string str.
2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
Use sample input and output to take idea about subsequences.
  
  
Sample Input
              yvTA
              
 Sample Output            
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A 


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		printSS(str,ans);

    }

    public static void printSS(String str, String ans) {
        if(str.length()==0)
    	{
    		System.out.println(ans);
    		return;
    	}
    	printSS(str.substring(1),ans+str.charAt(0));
    	printSS(str.substring(1),ans);
    	
    }

}
