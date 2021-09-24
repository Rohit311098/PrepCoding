import java.io.*;
import java.util.*;

public class Main{
    
    public static int[] getleftsmaller(int[] a)
    {
        int n=a.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=0;i<n;i++)
        {
            while(st.isEmpty()!=true && a[st.peek()]>=a[i])
            {
                st.pop();
            }
            if(st.isEmpty()==true)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=st.peek();
            }
            st.push(i);
        }
        
        return ans;
    }
    public static int[] getrightsmaller(int[] a)
    {
        int n=a.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=n-1;i>=0;i--)
        {
            while(st.isEmpty()!=true && a[st.peek()]>=a[i])
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
    
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    int[] left=getleftsmaller(a);
    int[] right=getrightsmaller(a);
    
    int max_ans=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        int curr_ans=(right[i]-left[i]-1)*a[i];
        
        max_ans=Math.max(max_ans,curr_ans);
    }
    
    System.out.println(max_ans);
 }
}
