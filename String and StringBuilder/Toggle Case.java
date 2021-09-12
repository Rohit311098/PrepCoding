Sample Input
          pepCODinG
Sample Output
        PEPcodINg

import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		String ans = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
		       ans+=(char)(str.charAt(i)+32);
			}
			else
			{
				ans+=(char)(str.charAt(i)-32);
				
			}
		}
		return ans;

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
