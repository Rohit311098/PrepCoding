public static void levelOrder(Node root) {
      
      if(root==null)
      {
          return;
      }
      
      Queue<Node> mainQ=new ArrayDeque<>();
      
      //Pushing root node
      mainQ.add(root);
      
      while(mainQ.size()>0)
      {
         Queue<Node> childQ=new ArrayDeque<>();
         
         while(mainQ.size()>0)
         {
             Node curr=mainQ.remove();
             System.out.print(curr.data+" ");
             
             if(curr.left!=null)
             {
                 childQ.add(curr.left);
             }
              
             if(curr.right!=null)
             {
                 childQ.add(curr.right);
             }
         }
         
         System.out.println();
         mainQ=childQ;
      }
  }
