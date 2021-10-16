 public static void levelOrder(Node root){
    // write your code here
    if(root==null)
    {
        return;
    }
    
    Queue<Node> q=new ArrayDeque<>();
    q.add(root);
    
    while(q.size()>0)
    {
        Node curr=q.remove();
        
        System.out.print(curr.data+" ");
        
        for(Node child:curr.children)
        {
            q.add(child);
        }
    }
    
    System.out.print(".");
  }
