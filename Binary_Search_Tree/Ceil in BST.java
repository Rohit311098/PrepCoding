class Tree {
    // Function to return the ceil of given number in BST.
    
    int ceil;
    
    void helper(Node root,int key)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.data==key)
        {
            ceil=root.data;
            return;
        }
        
        if(root.data>key)
        {
            ceil=root.data;
            helper(root.left,key);
        }
        else
        {
            helper(root.right,key);
        }
        
        
    }
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        
        ceil=-1;
        helper(root,key);
        return ceil;
    }
}
