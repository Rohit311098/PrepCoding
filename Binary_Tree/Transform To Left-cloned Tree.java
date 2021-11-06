public static Node createLeftCloneTree(Node root){
      
      if(root==null)
      {
          return null;
      }
      
      Node leftcloned=createLeftCloneTree(root.left);
      
      Node rightcloned=createLeftCloneTree(root.right);
      
      Node newnode=new Node(root.data);
      
      newnode.left=root.left;
      
      root.left=newnode;
    
     return root;
  }
