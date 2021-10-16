 public static int max(Node root) {
    // write your code here
    if(root==null)
    {
        return 0;
    }
    
    int max_element=root.data;
    
    for(Node child:root.children)
    {
        int max_from_children=max(child);
        max_element=Math.max(max_element,max_from_children);
    }
    
    return max_element;
  }
