public static int lca(Node root, int d1, int d2) {
      if(d1==root.data || d2==root.data)
      {
          return root.data;
      }
      else if(d1<root.data && d2<root.data)
      {
         return lca(root.left,d1,d2);
      }
      else if(d1>root.data && d2>root.data)
      {
        return lca(root.right,d1,d2);
      }
      else
      {
         return root.data;
      }
    
  }
