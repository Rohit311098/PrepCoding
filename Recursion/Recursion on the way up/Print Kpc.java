import java.io.*;
import java.util.*;

public class Main {
    static String[] keyword= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String asf="";
		printKPC(str,asf);

    }

    public static void printKPC(String str, String ans) {
        if(str.length()==0)
    	{
    		System.out.println(ans);
    		return;
    	}
        
    	char key=str.charAt(0);
    	int num=key-'0';
    	String s=keyword[num];
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		printKPC(str.substring(1),ans+c);
    	}
        
    }

}
