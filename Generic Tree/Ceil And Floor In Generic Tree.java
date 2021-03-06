1. You are given a partially written GenericTree class.
2. You are required to find the ceil and floor value of a given element. Use the "travel and change" strategy explained in the earlier video. The static properties - ceil and floor have been declared for you. You can declare more if you want. If the element is largest ceil will be largest integer value (32 bits), if element is smallest floor will be smallest integer value (32 bits). Watch the question video for clarity.
3. Input and Output is managed for you.
  
  Sample Input
        24
        10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
        70
Sample Output
        CEIL = 90
        FLOOR = 60

static int ceil=Integer.MAX_VALUE;
  static int floor=Integer.MIN_VALUE;
  public static void ceilAndFloor(Node root, int data) {
    // Write your code here
    if(root==null)
    {
        return;
    }
    
    if(root.data<data)
    {
        floor=Math.max(floor,root.data);
    }
    else if(root.data>data)
    {
        ceil=Math.min(ceil,root.data);
    }
    
    for(Node child:root.children)
    {
        ceilAndFloor(child,data);
    }
  }
