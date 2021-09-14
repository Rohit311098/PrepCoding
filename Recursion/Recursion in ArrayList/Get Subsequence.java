Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String> ans=gss(str);
		System.out.println(ans);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
		{
			ArrayList<String> ans=new ArrayList<String>();
			ans.add("");
			return ans;
		}
		ArrayList<String> temp=gss(str.substring(1));
		ArrayList<String> result=new ArrayList<String>();
		for(String s: temp)
		{
			result.add(s);
		}
		for(String s:temp)
		{
			result.add(str.charAt(0)+s);
		}
        return result;
    }

}
