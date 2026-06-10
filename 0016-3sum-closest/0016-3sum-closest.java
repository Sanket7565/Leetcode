class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        int res=0;
         int maxDiff=Integer.MAX_VALUE;

        Arrays.sort(nums);
        
        for (int i=0;i<nums.length-2;i++)
        {

            int left=i+1;
            int right=nums.length-1;
           
            

            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];

                if(sum==target)
                {
                    return sum;
                }

                else if(sum<target)
                {
                    if(maxDiff>Math.abs(sum-target))
                    {
                        maxDiff=Math.abs(sum-target);
                        res=sum;
                    }
                    left++;
                }
                else
                {
                    if(maxDiff>Math.abs(sum-target))
                    {
                        maxDiff=Math.abs(sum-target);
                        res=sum;
                    }
                    right--;
                }
            }
        }

        return res;
        
    }
}