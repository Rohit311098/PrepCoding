 public void display()
 {
      // write code here
      Node node=head;
      
      while(node!=null)
      {
          System.out.print(node.data+" ");
          node=node.next;
      }
      System.out.println();
    }
}


