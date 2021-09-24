import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Stack<Character> stk = new Stack<Character>();

    for (int i = 0; i < s.length(); i++)
    {
      char ch = s.charAt(i);
      if (ch == ')')
      {
        if (stk.isEmpty() != true && stk.peek() == '(')
        {
          stk.pop();
        }
        else
        {
          System.out.println("false");
          return;
        }


      }
      else if ( ch == '}')
      {
        if (stk.isEmpty() != true && stk.peek() == '{')
        {
          stk.pop();
        }
        else
        {
          System.out.println("false");
          return;
        }

      }
      else if (ch == ']')
      {
        if (stk.isEmpty() != true && stk.peek() == '[')
        {
          stk.pop();
        }
        else
        {
          System.out.println("false");
          return;
        }
      }
      else if (ch == '(' || ch == '{' || ch == '[')
      {
        stk.push(ch);
      }
    }

    System.out.println(stk.isEmpty());

  }

}
