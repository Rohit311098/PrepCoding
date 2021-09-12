Sample Input
              abcc
Sample Output
                a
                b
                c
                cc
                c

import java.io.*;
import java.util.*;

public class Main {
    private static boolean ispalindrome(String sub) {
		if(sub.length()==1)
		{
			return true;
		}
		if(sub.length()==2 && sub.charAt(0)==sub.charAt(1))
		{
			return true;
		}
		int left=0,right=sub.length()-1;
		while(left<right)
		{
			if(sub.charAt(left)!=sub.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void solution(String str){
		//write your code here
		for(int start=0;start<str.length();start++)
		{
			for(int end=start+1;end<=str.length();end++)
			{
				String sub=str.substring(start,end);
				if(ispalindrome(sub))
				{
					System.out.println(sub);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
