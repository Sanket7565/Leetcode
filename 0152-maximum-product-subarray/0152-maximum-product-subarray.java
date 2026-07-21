class Solution {
    public int maxProduct(int[] nums) 
    {
        int currentMax=nums[0];
        int currentMin=nums[0];
        int bestAns=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int contributeMax=currentMax*nums[i];

            int contributeMin=currentMin*nums[i];

            int self=nums[i];

            currentMin=Math.min(self,Math.min(contributeMax,contributeMin));

            currentMax=Math.max(self,Math.max(contributeMax,contributeMin));

            bestAns=Math.max(currentMax,bestAns);
        }

        return bestAns;
        
    }
}