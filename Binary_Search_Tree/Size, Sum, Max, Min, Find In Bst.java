 public static int size(Node root) {
    if(root==null)
    {
        return 0;
    }
    
    
    return 1+size(root.left)+size(root.right);
  }

  public static int sum(Node root) {
    if(root==null)
    {
        return 0;
    }
    
    return root.data+sum(root.left)+sum(root.right);
  }

  public static int max(Node root) {
    if(root==null)
    {
        return 0;
    }
    
    if(root.right==null)
    {
        return root.data;
    }
    
    return max(root.right);
  }

  public static int min(Node root) {
    if(root==null)
    {
        return 0;
    }
    
    if(root.left==null)
    {
        return root.data;
    }
    
    return min(root.left);
  }

  public static boolean find(Node root, int data){
    if(root==null)
    {
        return false;
    }
    
    if(root.data==data)
    {
        return true;
    }
    
    if(root.data>data)
    {
        return find(root.left,data);
    }

    return find(root.right,data);
  }  
