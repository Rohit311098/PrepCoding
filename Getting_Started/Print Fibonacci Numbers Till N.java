import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int a=0,b=1;
      if(n==1)
      {
          System.out.println(a);
      }
      else if(n==2)
      {
          System.out.println(a);
          System.out.println(b);
      }
      else
      {
         System.out.println(a);
         System.out.println(b);
         for(int i=2;i<n;i++)
         {
             System.out.println(a+b);
             int temp=a;
             a=b;
             b=temp+b;
         }
      }
   }
  }
