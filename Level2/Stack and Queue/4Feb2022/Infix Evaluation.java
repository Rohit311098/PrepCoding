import java.util.*;
import java.io.*;

public static Main
{
 public static int prec(char ch)
    {
        if(ch=='*' || ch=='/') return 2;
        
        if(ch=='+' || ch=='-') return 1;
        
        return 0;
    }
  
public static int perform(int a,char ch,int b)
    {
        if(ch=='+')
        {
            return a+b;
        }
        else if(ch=='-')
        {
            return b-a;
        }
        else if(ch=='*')
        {
            return b*a;
        }
        else 
        {
            return b/a;
        }
    }
    
public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Character> operator=new Stack<>();
    Stack<Integer> operand=new Stack<>();
    
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(ch>='0' && ch<='9')
        {
            //operand ko directly push kar do
            operand.push(ch-'0');
        }
        else if(ch=='(')
        {
            operator.push(ch);
        }
        else if(ch==')')
        {
            while(operator.peek()!='(')
            {
                int a=operand.pop();
                int b=operand.pop();
                char op=operator.pop();
                operand.push(perform(a,op,b));
            }
            
            // '(' ko pop karte hai last mai
            operator.pop();
            
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            
            while(operator.size()>0 && operator.peek()!='(' && prec(operator.peek())>=prec(ch))
            {
                int a=operand.pop();
                int b=operand.pop();
                char op=operator.pop();
                operand.push(perform(a,op,b));
                
            }
            operator.push(ch);
        }
    }
    
    while(operator.size()>0 )
    {
        int a=operand.pop();
        int b=operand.pop();
        char op=operator.pop();
        operand.push(perform(a,op,b));
                
    }
    
    System.out.println(operand.peek());
}
}
