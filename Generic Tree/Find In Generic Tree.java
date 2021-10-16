public static boolean find(Node curr, int data) {
    // write your code here
    if(curr==null)
    {
        return false;
    }
    
    if(curr.data==data)
    {
        return true;
    }
    
    boolean ans=false;
    for(Node child:curr.children)
    {
        ans= find(child,data);
        
        if(ans==true)
        {
            return true;
        }
    }
    
    return ans;
  }
