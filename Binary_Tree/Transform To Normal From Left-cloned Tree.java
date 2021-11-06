public static Node transBackFromLeftClonedTree(Node root){
    // write your code here
     if(root==null)
      {
          return null;
      }
      
      Node leftcloned=transBackFromLeftClonedTree(root.left.left);
      
      Node rightcloned=transBackFromLeftClonedTree(root.right);
      
     root.left=root.left.left;
    
     return root;
  }
