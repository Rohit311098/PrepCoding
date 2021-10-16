 //This can be done by finding height in terms of nodes-1
  //This height is in terms of edge
  public static int height(Node root) {
      if(root==null)
      {
          return 0;
      }
      
      //If current node is child node then we don't take it into accountwhile calcualting the height
      if(root.children.size()==0)
      {
          return 0;
      }
      
      int max_height=0;
      
      for(Node child:root.children)
      {
          int child_height=height(child);
          
          max_height=Math.max(max_height,child_height);
      }
      
      
      return max_height+1;
  }
