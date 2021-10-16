public static boolean areMirror(Node n1, Node n2) {
    // write your code here
     if(n1==null || n2==null)
    {
        return false;
    }
    
    if(n1.children.size()!=n2.children.size())
    {
        return false;
    }
    
    for(int i=0;i<n1.children.size();i++)
    {
        //1 st tree ka first node
        Node c1=n1.children.get(i);
        
        //2nd tree ka last node 
        Node c2=n2.children.get(n2.children.size()-i-1);
        
//check kar rahe hai 1st node of tree1 and last node of tree 2 are same or not
        boolean ans=areMirror(c1,c2);
        
        if(ans==false)
        {
            return false;
        }
    }
    
    return true;
  }
