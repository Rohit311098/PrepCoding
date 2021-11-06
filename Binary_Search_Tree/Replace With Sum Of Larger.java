static int sum = 0;
  public static void rwsol(Node root){
    if(root==null)
    {
        return;
    }
    
    rwsol(root.right);
    
    int temp=root.data;
    root.data=sum;
    
    sum+=temp;
    
    rwsol(root.left);
  }
