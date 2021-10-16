
  public static void mirror(Node root){
    // write your code here
    
    if(root==null)
    {
        return;
    }
    
    for(Node child:root.children)
    {
        mirror(child);
    }
    
    reversearray(root.children);
    //Collections.reverse(root.children);
     
  }

public static void reversearray(ArrayList<Node> arr)
  {
      for(int i=0,j=arr.size()-1;i<j;i++,j--)
      {
          Node temp=arr.get(i);
        
          arr.set(i,arr.get(j));
          arr.set(j,temp);
      }
      
     // return arr;
  }
