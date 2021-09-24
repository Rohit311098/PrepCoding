import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    
    swm(a,k);
 }
 
 public static void swm(int[]a, int k)
 {
    
    int[] right=getgreaterright(a);
    int n=a.length;
    int prevWinMax=0;
    for(int i=0;i<=n-k;i++)
    {
        int curr;
        
        if(prevWinMax>=i && prevWinMax<i+k)
        {
            curr=prevWinMax;
        }
        else
        {
          curr=i;  
        }
        while(right[curr]<i+k)
        {
            curr=right[curr];
        }
        prevWinMax=curr;
        System.out.println(a[curr]);
    }
 }
 
 public static int[] getgreaterright(int[] a)
 {
     int n=a.length;
    Stack<Integer> st=new Stack<Integer>();
    int[] ans=new int[n];
    
    for(int i=n-1;i>=0;i--)
    {
        while(st.isEmpty()!=true && a[st.peek()]<a[i])
        {
            st.pop();
        }
        
        if(st.isEmpty()==true)
        {
            ans[i]=n;
        }
        else
        {
            ans[i]=st.peek();
        }
        st.push(i);
    }
    return ans;
 }
 
}
