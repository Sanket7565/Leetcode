class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int low=0;
        int high=k-1;
        double maxAvg=Integer.MIN_VALUE;
        int sum=0;

        for(int i=low;i<=high;i++)
        {
            sum+=nums[i];

        }

        maxAvg=(double)sum/k;

        for(int i=high;i<nums.length;i++)
        {
            low++;
            high++;

            if(high==nums.length)
            {
                break;
            }
            
            sum=sum-nums[low-1];
            sum=sum+nums[high];
            maxAvg=Math.max(maxAvg,(double)sum/k);

        }

        return maxAvg;
        
    }
}