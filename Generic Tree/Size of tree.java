public static int size(Node root){
      if(root==null)
      {
          return 0;
      }
      
      int count=1;
      
      for(Node child:root.children)
      {
          count+=size(child);
      }
    
    return count;
}
