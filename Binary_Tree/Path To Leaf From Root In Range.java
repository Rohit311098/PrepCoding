public static void pathToLeafFromRoot(Node root, String path, int sum, int low, int high){
    // write your code here
    if(root==null)
    {
        return;
    }
    
    sum+=root.data;
    path=path+root.data+" ";
    if(root.left==null && root.right==null && sum>=low && sum<=high)
    {
        System.out.println(path);
        return;
    }
    
    pathToLeafFromRoot(root.left,path,sum,low,high);
    
    pathToLeafFromRoot(root.right,path,sum,low,high);
  }
