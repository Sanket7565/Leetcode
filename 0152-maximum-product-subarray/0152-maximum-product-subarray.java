class Solution {
    public int maxProduct(int[] nums) 
    {
        int currentMax=nums[0];
        int currentMin=nums[0];
        int bestAns=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int contributeMax=currentMax*nums[i]; //choice1
            int contributeMin=currentMin*nums[i]; //choice2
            int self=nums[i];  //choice3

            currentMin=Math.min(self,Math.min(contributeMax,contributeMin)); //update currentmin
            currentMax=Math.max(self,Math.max(contributeMax,contributeMin)); //update currentmax
            bestAns=Math.max(currentMax,bestAns);  //update bestAns
        }

        return bestAns;
        
    }
}