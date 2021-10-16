1. You are given a partially written GenericTree class.
2. You are given a number k. You are required to find and print the kth largest value in the tree.
3. Input and Output is managed for you.
  
  Sample Input
          24
          10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
          8 (K value)
Sample Output
          10
          
  
  
  
  public static int kthLargest(Node root, int k){
    // write your code here
    
    int max_element=Integer.MAX_VALUE;
    for(int i=0;i<k;i++)
    {
        ceilvalue(root,max_element);
        
        max_element=floor;
        
        floor=Integer.MIN_VALUE;
    }
    
    return max_element;
  }

static int floor=Integer.MIN_VALUE;
 
 public static void ceilvalue(Node root,int data)
 {
     if(root.data<data)
     {
         floor=Math.max(root.data,floor);
     }
     
     for(Node child:root.children)
     {
         ceilvalue(child,data);
     }
 }
          
  
  
