class Solution
{
    static int k = 0;
    static int[] temp;
    public int[] sortedArrayToBST(int[] nums)
    {
        int sI = 0;
        int eI = nums.length-1;
        temp = new int[nums.length];
        Arrays.fill(temp, 0);
        helper(nums, sI, eI);
        
        return temp;
    }
    
    private static void helper(int nums[], int sI, int eI){
        if(sI <= eI){
            int mid = (sI + eI)/2;
            
            if(k < temp.length)
                temp[k++] = nums[mid];
            
            helper(nums, sI, mid-1);
            helper(nums, mid+1, eI);
        }
        
        return;
    }
    
}
