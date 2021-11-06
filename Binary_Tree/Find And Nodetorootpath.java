  public static boolean find(Node root, int data){
 
    if(root==null)
    {
        return false;
    }
    
    if(root.data==data)
    {
        return true;
    }
    
    boolean left=find(root.left,data);
    
    if(left==true)
    {
        return true;
    }
    
     boolean right=find(root.right,data);
    
    if(right==true)
    {
        return true;
    }
    
    return false;
    
  }

  public static ArrayList<Integer> nodeToRootPath(Node root, int data){
    // write your code here
     if(root==null)
      {
        return new ArrayList<Integer>();
      }
      
      if(root.data==data)
      {
        ArrayList<Integer> arr=new ArrayList<Integer>();
          
        arr.add(root.data);
         return arr; 
      }
      
      ArrayList<Integer> leftarr=nodeToRootPath(root.left,data);
      
      if(leftarr.size()>0)
      {
          leftarr.add(root.data);
          return leftarr;
      }
      
      ArrayList<Integer> rightarr=nodeToRootPath(root.right,data);
      
      if(rightarr.size()>0)
      {
          rightarr.add(root.data);
          return rightarr;
      }
      return new ArrayList<>();
  }
