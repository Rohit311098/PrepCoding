//   static boolean isbalanced=true;
//   public static int height(Node root)
//   {
//       if(root==null)
//       {
//           return 0;
//       }
//       if(root.left==null && root.right==null)
//       {
//           return 1;
//       }
      
//       int left_height=height(root.left);
      
//       if(isbalanced==false)
//       {
//           return Integer.MAX_VALUE;
//       }
      
//       int right_height=height(root.right);
      
//       if(isbalanced==false)
//       {
//           return Integer.MAX_VALUE;
//       }
      
//       int curr_isbalanced=Math.abs(left_height-right_height);
      
//       if(curr_isbalanced>1)
//       {
//         isbalanced=false;
//       }
      
//       int curr_height=Math.max(left_height,right_height);
      
//       return curr_height+1;
//   }
  
  public static class Pairbal
  {
      int height;
      boolean isbalanced;
      
      Pairbal()
      {
          height=0;
          isbalanced=true;
      }
      
  }
  
  public static Pairbal height2(Node root)
  {
      if(root==null)
      {
          Pairbal curr_node=new Pairbal();
          return curr_node;
      }
      
      if(root.left==null && root.right==null)
      {
          Pairbal curr_node=new Pairbal();
          curr_node.height=1;
          return curr_node;
      }
      
      Pairbal curr_node=new Pairbal();
      
      Pairbal left=height2(root.left);
      
      Pairbal right=height2(root.right);
      
      if(left.isbalanced==false || right.isbalanced==false || Math.abs(left.height-right.height)>1)
      {
          curr_node.isbalanced=false;
      }

     curr_node.height=Math.max(left.height,right.height)+1;
      return curr_node;
  }
