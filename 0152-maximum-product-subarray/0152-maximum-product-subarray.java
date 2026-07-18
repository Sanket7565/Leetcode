class Solution {
    public int maxProduct(int[] nums)
    {
        int currentMaxAns= nums[0];
        int currentMinAns= nums[0];
        int bestAns=nums[0];

        for (int i=1;i<nums.length; i++)
        {
            int contributeToMax= currentMaxAns*nums[i];
            int contributeToMin= currentMinAns*nums[i];
            int self= nums[i];

            currentMaxAns= Math.max(self,Math.max(contributeToMax,contributeToMin));
            currentMinAns= Math.min(self,Math.min(contributeToMax,contributeToMin));

            bestAns= Math.max(bestAns,currentMaxAns); 
        }

        return bestAns;
        
    }
        
    }