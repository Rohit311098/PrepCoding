This is Method 1
  Finding last Node of the SecondlastLinear Subtree
  
  public static Node getlastnode(Node curr)
  {
      while(curr.children.size()>0)
      {
          curr=curr.children.get(0);
      }
      
      return curr;
  }

  public static void linearize(Node root){
    // write your code here
    
    for(Node child:root.children)
    {
        linearize(child);
    }
    //1 children hoga toh vo already linear ho chuka or already linear hai
    while(root.children.size()>1)
    {
        //Removing the last children of current Node
        Node lastNoderoot= root.children.remove(root.children.size()-1);
        
        //Now once removed second last Node comes in last position hence we are just getting it not removing because we have to add our last child node into the lastnode of secondlastnode
        
        Node secondlastNoderoot=root.children.get(root.children.size()-1);
        
        //finding last node of secondlast child linear tree
        Node lastNodesecondroot=getlastnode(secondlastNoderoot);
        
        //Adding our last child after 
        lastNodesecondroot.children.add(lastNoderoot);
    }
  }


This is Method 2
  
public static Node linearizehelper(Node root)
  {
      if(root.children.size()==0)
      {
          return root;
      }
      
      //Getting lastnode of last child as it is same always dry run kar le samaj aa jaayega
    Node lastnode=linearizehelper(root.children.get(root.children.size()-1));
    
    while(root.children.size()>1)
    {
        //Getting last child of curr node
        Node lastchildhead=root.children.remove(root.children.size()-1);
        
        
        //getting last trail of secondd last child after linearizing it
        Node secondlasttail=linearizehelper(root.children.get(root.children.size()-1));
        
        secondlasttail.children.add(lastchildhead);
    }
    
    return lastnode;
  }
   public static void linearize(Node root){
    //If tree is null
    
    if(root==null)
    {
        return;
    }
    
    //If root has only 1 child
    if(root.children.size()==0)
    {
        return;
    }
    
    linearizehelper(root);
    
   
  }
  



