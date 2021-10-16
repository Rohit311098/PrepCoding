private static class Node {
    int data;
    ArrayList<Node> children;
    
    Node(int data)
    {
        this.data=data;
        this.children=new ArrayList<Node>();
    }
    
    Node()
    {
        this.data=0;
        this.children=new ArrayList<Node>();
    }
  }


  public static Node construct(int[] a) {
      
      Stack<Node> st=new Stack<Node>();
      Node root=null;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]==-1)
          {
              st.pop();
          }
          else
          {
              Node newnode=new Node(a[i]);
              if(root==null)
              {
                  root=newnode;
                 
              }
              else 
              {
                 Node parent=st.peek();
                 
                 parent.children.add(newnode);
              }
              st.push(newnode);
          }
      }
      return root;
    }
  
