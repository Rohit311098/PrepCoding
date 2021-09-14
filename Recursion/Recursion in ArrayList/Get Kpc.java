1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.
      
      
      
Sample Input
78
Sample Output
[tv, tw, tx, uv, uw, ux]


import java.io.*;
import java.util.*;

public class Main {
    static String[] keyword= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String> ans=getKPC(str);
		System.out.println(ans);

    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
		{
			ArrayList<String> ans=new ArrayList<String>();
			ans.add("");
			return ans;
		}
		ArrayList<String> temp=getKPC(str.substring(1));
		ArrayList<String> result=new ArrayList<String>();
		int num=str.charAt(0)-'0';
		String numstr=keyword[num];
		for(int i=0;i<numstr.length();i++)
		{
			for(String j:temp)
			{
				String ans=numstr.charAt(i)+j;
				result.add(ans);
			}
		}
		
        return result;
    }

}
