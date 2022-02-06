TC-O(N) SC-O(1)
  public int maxArea(int[] arr) {
        
        int left=0,right=arr.length-1;
        
        int maxwater=0,currwater=0;
        
        while(left<right)
        {
            if(arr[left]<=arr[right])
            {
                currwater=arr[left]*(right-left);
                left++;
            }
            else
            {
                currwater=arr[right]*(right-left);
                right--;
            }
            if(currwater>maxwater)
            {
                maxwater=currwater;
            }
        }
        
        return maxwater;
        
    }
