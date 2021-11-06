public static Node maxleft(Node root)
  {
      if(root==null)
      {
          return null;
      }
      
      if(root.right==null)
      {
          return root;
      }
      
      return maxleft(root.right);
  }
  public static Node remove(Node root, int data) {
      if(root==null)
      {
          return null;
      }
      
      if(root.data==data)
      {
          //If node is leaf node
          if(root.left==null && root.right==null)
          {
              return null;
          }
          else if(root.left==null )
          {
              //If left child is null means only 1 child that is right child so simply return right child
              return root.right;
          }
          else if(root.right==null )
          {
              //If right child is null then simply return left child
              return root.left;
          }
          else
          {
              //If we have 2 child
              
              //Then either take max from left or min from right subtree then swap them and then delete leaf node
              Node temp=maxleft(root.left);
              root.data=temp.data;
              root.left=remove(root.left,temp.data);
          }
      }
      else if(root.data>data)
      {
          root.left=remove(root.left,data);
      }
      else
      {
          root.right=remove(root.right,data);
      }
      
      return root;
    
  }
