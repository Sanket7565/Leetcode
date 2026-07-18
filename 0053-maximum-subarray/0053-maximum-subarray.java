class Solution {
    public int maxSubArray(int[] nums) 
    {
        int currentAns= nums[0];
        int bestAns=nums[0];

        for (int i=1;i<nums.length; i++)
        {
            int contribute= currentAns+nums[i];
            int self= nums[i];

             currentAns= Math.max(contribute,self);

            bestAns= Math.max(currentAns,bestAns); 
        }

        return bestAns;
        
    }
}