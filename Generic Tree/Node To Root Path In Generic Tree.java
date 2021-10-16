public static ArrayList<Integer> nodeToRootPath(Node root, int data){
    
    if(root==null)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        return arr;
    }
    if(root.data==data)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(root.data);
        return arr;
    }
    
    ArrayList<Integer> child_result=new ArrayList<Integer>();
    for(Node child:root.children)
    {
        child_result=nodeToRootPath(child,data);
        
        if(child_result.size()>0)
        {
            child_result.add(root.data);
            return child_result;
        }
    }
    
    return child_result;
 }
