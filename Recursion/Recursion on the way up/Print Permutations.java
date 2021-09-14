1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.
  
  
Sample Input
                abc
Sample Output
                  abc
                  acb
                  bac
                  bca
                  cab
                  cba
                  
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printPermutations(s,"");

    }

    public static void printPermutations(String str, String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char choice=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1,str.length());
            printPermutations(newstr,ans+choice);
        }
        
    }

}
