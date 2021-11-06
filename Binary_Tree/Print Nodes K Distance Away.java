 public static ArrayList<Node> nodetoroot(Node root,int data)
  {
      if(root==null)
      {
         ArrayList<Node> a=new ArrayList<Node>();
        return a;
      }
      
      if(root.data==data)
      {
        ArrayList<Node> arr=new ArrayList<Node>();
          
        arr.add(root);
         return arr; 
      }
      
      ArrayList<Node> leftarr=nodetoroot(root.left,data);
      
      if(leftarr.size()>0)
      {
          leftarr.add(root);
          return leftarr;
      }
      
      ArrayList<Node> rightarr=nodetoroot(root.right,data);
      
      if(rightarr.size()>0)
      {
          rightarr.add(root);
          return rightarr;
      }
      
      
      return new ArrayList<>();
      
  }
  
  public static void printklevel(Node root,int level,Node block)
  {
      if(root==null || root==block)
      {
          return;
      }
      
      if(level==0)
      {
          System.out.println(root.data);
      }
      
      printklevel(root.left,level-1,block);
      
       printklevel(root.right,level-1,block);
      
      
  }
  public static void printKNodesFar(Node root, int data, int k) {
    
    ArrayList<Node> path=nodetoroot(root,data);
    
    for(int i=0;i<=k && i<path.size();i++)
    {
        if(i==0)
        {
            printklevel(path.get(i),k,null);
        }
        else
        {
            printklevel(path.get(i),k-i,path.get(i-1));
        }
    }
  }
