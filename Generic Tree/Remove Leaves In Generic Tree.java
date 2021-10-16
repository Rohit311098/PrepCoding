public static void removeLeaves(Node root) {
    // write your code here
   if(root==null)
   {
       return;
   }
   
    for(int i=root.children.size()-1;i>=0;i--)
    {
        Node curr=root.children.get(i);
        if(curr.children.size()==0)
        {
            root.children.remove(i);
        }
    }
    
    for(Node child:root.children)
    {
        removeLeaves(child);
    }
  }
