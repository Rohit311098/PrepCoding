public static void printSingleChildNodes(Node root){
      
      if(root==null)
      {
          return;
      }
      
      if(root.left==null && root.right!=null)
      {
         System.out.println(root.right.data);
         return ;
      }
      if(root.right==null && root.left!=null)
      {
          System.out.println(root.left.data);
         return ;
          
      }
      printSingleChildNodes(root.left);
      
      printSingleChildNodes(root.right);
      
     
    
  }

//   public static void printSingleChildNodes(Node root,Node parent){
      
//       if(root==null)
//       {
//           return;
//       }
      
//       printSingleChildNodes(root.left,root);
      
//       printSingleChildNodes(root.right,root);
      
//       if(parent!=null && parent.left==null && parent.right!=null)
//       {
//          System.out.println(parent.right.data);
//          return ;
//       }
//       if(parent!=null && parent.right==null && parent.left!=null)
//       {
//           System.out.println(parent.left.data);
//          return ;
          
//       }
    
//   }
