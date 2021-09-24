import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "
");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   int[] ans=new int[arr.length];
   Stack<Integer> stk=new Stack<Integer>();
   
   for(int i=0;i<arr.length;i++)
   {
       while(stk.isEmpty()!=true && arr[stk.peek()]<arr[i])
       {
           stk.pop();
       }
       
       if(stk.isEmpty()!=true)
       {
           ans[i]=i-stk.peek();
       }
       
       if(stk.isEmpty()==true)
       {
           ans[i]=i+1;
       }
       stk.push(i);
   }
   return ans;
 }

}
