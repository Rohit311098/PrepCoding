//   public static Node add(Node root, int data) {
//     if(root==null)
//     {
//         Node newnode=new Node(data);
//         return newnode;
        
//     }
    
//     if(root.data==data)
//     {
//         return root;
//     }
//     else if(root.data>data)
//     {
//           root.left=add(root.left,data);
//     }
//     else
//     {
       
//         root.right=add(root.right,data);
//     }
    
//     return root;
//   }
  public static void add2(Node root, int data) {
    if(root==null)
    {
        Node newnode=new Node(data);
        root=newnode;
        return;
        
    }
    
    if(root.data==data)
    {
        return;
    }
    else if(root.data>data)
    {
        if(root.left==null)
        {
            Node newnode=new Node(data);
            root.left=newnode;
            return;
        }
        add2(root.left,data);
    }
    else
    {
         if(root.right==null)
        {
            Node newnode=new Node(data);
            root.right=newnode;
            return;
        }
        add2(root.right,data);
    }
    
    return ;
  }
