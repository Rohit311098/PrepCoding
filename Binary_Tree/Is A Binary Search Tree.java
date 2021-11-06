public static boolean bstcheck(Node root,int min,int max)
 {
     if(root==null)
     {
         return true;
     }
     
     if(root.data>min && root.data<max)
     {
         boolean lres=bstcheck(root.left,min,root.data);
         
         boolean rres=bstcheck(root.right,root.data,max);
         
         return lres && rres;
     }
     
     return false;
 }
