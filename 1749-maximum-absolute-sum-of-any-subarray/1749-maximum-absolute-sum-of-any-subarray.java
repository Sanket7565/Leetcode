class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        int currentMin = nums[0];
        int currentMax = nums[0];

        int bestMin = nums[0];
        int bestMax = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            int contributeMin = currentMin + nums[i];
            int contributeMax = currentMax + nums[i];
            int self = nums[i];

            currentMin = Math.min(contributeMin, self);
            currentMax = Math.max(contributeMax, self);

            bestMin = Math.min(bestMin, currentMin);
            bestMax = Math.max(bestMax, currentMax);
        }

        return Math.max(bestMax, Math.abs(bestMin));
    }
}