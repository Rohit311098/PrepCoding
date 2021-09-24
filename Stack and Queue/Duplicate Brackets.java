import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stk=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==')')
            {
                int count=0;
                //Poping all the content within '(' and ')'
                while(stk.peek()!='(')
                {
                    stk.pop();
                    count++;
                }
                stk.pop();
                
                //if there is not content so count=0 hence we find duplicate                      bracket or extra braket
                
                if(count==0)
                {
                    System.out.println("true");
                    return;
                }
            }
            else 
            {
                stk.push(ch);
            }
        }
        System.out.println("false");

        

    }

}
