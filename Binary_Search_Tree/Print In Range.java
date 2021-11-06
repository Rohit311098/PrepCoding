public static void pir(Node root, int d1, int d2) {
    // write your code here
    if(root==null)
    {
        return;
    }
    if(root.data>=d1 && root.data<=d2)
    {
        pir(root.left,d1,d2);
        System.out.println(root.data);
        pir(root.right,d1,d2);
    }
    else if(root.data<d1)
    {
        pir(root.right,d1,d2);
    }
    else if(root.data>d2)
    {
       pir(root.left,d1,d2); 
    }
    
    return;
  }
