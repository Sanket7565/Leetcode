class Solution
 {
    public int removeDuplicates(int[] nums) 
    {
    
    int off=0;
    int cm=1;

    while (cm<nums.length)
    {
        if(nums[off]==nums[cm])
        {
            cm++;
        }
        else
        {
            off++;
            nums[off]=nums[cm];
            cm++;
        }
    }

    return off+1;
        
    }
}