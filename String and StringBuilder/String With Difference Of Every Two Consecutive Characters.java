Sample Input
          pepCODinG
Sample Output
          p-11e11p-45C12O-11D37i5n-39G
          
         
 import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
	   StringBuilder ans=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(i==str.length()-1)
			{
				ans.append(str.charAt(i));
				continue;
			}
			ans.append(str.charAt(i));
			ans.append(str.charAt(i+1)-str.charAt(i));
		}
    return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}



