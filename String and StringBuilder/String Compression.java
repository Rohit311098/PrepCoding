Sample Input
        wwwwaaadexxxxxx
Sample Output
        wadex
        w4a3dex6

import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(i==0 || str.charAt(i-1)!=str.charAt(i))
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static String compression2(String str){
	StringBuilder sb=new StringBuilder();
	   int counter=0;
	   for(int i=0;i<str.length();i++)
	   {
		   if(i==0 || str.charAt(i-1)!=str.charAt(i))
		   {
			   if(counter>1)
			   {
				   sb.append(counter);
			   }
			   sb.append(str.charAt(i));
			   counter=1;
		   }
		   else
		   {
			   counter++;
		   }
	   }
	   if(counter>1)
	   {
	   sb.append(counter);
	   }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
