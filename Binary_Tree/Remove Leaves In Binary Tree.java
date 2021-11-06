 public static Node removeLeaves(Node root){
    
    if(root==null)
    {
        return null;
    }
    
    if(root.left==null && root.right==null)
    {
        root=null;
        return root;
    }
    
    Node left=removeLeaves(root.left);
    
    Node right=removeLeaves(root.right);
    
    root.left=left;
    
    root.right=right;
    
    return root;
 
  }
   
   public static void removeLeaves1(Node root){
    
    if(root==null)
    {
        return ;
    }
    
    if(root.left!=null)
    {
        if(root.left.left==null && root.left.right==null)
        {
            root.left=null;
        }
    }
    
    if(root.right!=null)
    {
        if(root.right.left==null && root.right.right==null)
        {
            root.right=null;
        }
    }
    
    removeLeaves1(root.left);
    removeLeaves1(root.right);
 
  }
