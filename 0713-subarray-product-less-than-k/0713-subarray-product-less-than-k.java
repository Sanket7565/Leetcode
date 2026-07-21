class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int low=0;
        int prod=1;
        int count=0;

if(k<=1)
{
    return 0;
}
        for (int high=0; high<nums.length;high++)
        {
            prod*=nums[high];

            while(prod>=k)
            {
                prod=prod/nums[low];
                low++;
                
            }
            count+= high-low+1;

        }

        return count;
        
    }
}