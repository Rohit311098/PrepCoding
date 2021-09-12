import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int d = getValueIndecimal(n, sourceBase);
      int dn = getValueInBase(d, destBase);
      System.out.println(dn);
   }
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int ans=0;
       int power=1;
       while(n>0)
       {
           int digit=n%10;
           ans+=(power*digit);
           n=n/10;
           power*=b;
       }
       return ans;
   }
   public static int getValueInBase(int n, int b){
       // write code here
       int ans=0;
       int power=1;
       while(n>0)
       {
           int digit=n%b;
           ans+=(power*digit);
           n=n/b;
           power*=10;
       }
       return ans;
   }
  }
