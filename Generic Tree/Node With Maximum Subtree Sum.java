1. You are given a partially written GenericTree class.
2. You are required to find and print the node which has the subtree with largest sum. Also print the sum of the concerned subtree separated from node's value by an '@'. Refer the question video for clarity.
3. Input is managed for you.
  
  Sample Input
      20
      10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1
  
  
Sample Output
          30@130

import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }
  
  static int global_max=Integer.MIN_VALUE;
  static Node global_root=null;
  public static int maxsum(Node root)
  {
      int curr_sum=root.data;
      
      for(Node child:root.children)
      {
         curr_sum+=maxsum(child);
         
      }
      if(curr_sum>global_max)
       {
            global_max=Math.max(curr_sum,global_max);
            global_root=root;
         }
      
      return curr_sum;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    
    maxsum(root);
    System.out.println(global_root.data+"@"+global_max);
  }

}
