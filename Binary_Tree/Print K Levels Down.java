 public static void printKLevelsDown(Node root, int k){
    // write your code here
    if(root==null)
    {
        return;
    }
    
    if(k==0)
    {
        System.out.println(root.data);
        return;
    }
    
    printKLevelsDown(root.left,k-1);
    
    printKLevelsDown(root.right,k-1);
    
  }
  
  public static void printKLevelsDown2(Node root,int curr,int k){
    // write your code here
    if(root==null)
    {
        return;
    }
    
    if(curr==k)
    {
        System.out.println(root.data);
        return;
    }
    
    printKLevelsDown2(root.left,curr+1,k);
    
    printKLevelsDown2(root.right,curr+1,k);
    
  }
