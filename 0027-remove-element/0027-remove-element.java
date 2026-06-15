class Solution {
    public int removeElement(int[] nums, int val) 
    {
        Arrays.sort(nums);

        int left=0;
       int right=0;
        //int count=0;

        while(right<=nums.length-1)
        {
            if(nums[right]!=val)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;

                left++;
                right++;
            }
            else
            {
                right++;
            }
        
        }

        return left;
        
    }
}