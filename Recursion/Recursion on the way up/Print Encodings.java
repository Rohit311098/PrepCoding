1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
Use the input-output below to get more understanding on what is required
123 -> abc, aw, lc
993 -> iic
013 -> Invalid input. A string starting with 0 will not be passed.
103 -> jc
303 -> No output possible. But such a string maybe passed. In this case print nothing.
  
  
 Sample Input
              655196

Sample Output
              feeaif
              feesf
              
import java.io.*;
import java.util.*;

public class Main {
   

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printEncodings(s,"");

    }

    public static void printEncodings(String input,String output) {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        //Only 1 charcater extracted
        char ch1=input.charAt(0);
        
        if(ch1>='1' && ch1<='9')
        {
            printEncodings(input.substring(1),output+(char)(ch1-'0'+96));
            
        }
        if(input.length()>1)
        {
        
            //When two character extracted
            String ch12=input.substring(0,2);
            int ch12Int=Integer.parseInt(ch12);
            
            //We check if ch12 is betweeen 10 and 26
            if(ch12Int>=10 && ch12Int<=26)
            {
                printEncodings(input.substring(2),output+(char)(ch12Int+96));
            }
        }
        
        
        
        
        
    }

} 
