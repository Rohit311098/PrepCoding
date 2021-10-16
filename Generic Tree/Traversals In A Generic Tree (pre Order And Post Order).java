public static void traversals(Node root){
    // write your code here
    if(root==null)
    {
        return;
    }
    
    System.out.println("Node Pre "+root.data);
    
    for(Node child:root.children)
    {
        System.out.println("Edge Pre "+root.data+"--"+child.data);
        
        traversals(child);
        
        System.out.println("Edge Post "+root.data+"--"+child.data);
    }
    
    System.out.println("Node Post "+root.data);
  }
