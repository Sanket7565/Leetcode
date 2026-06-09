class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int i=0;
        int j=nums.length-1;
        int id=nums.length-1;
        int res[]=new int[nums.length];

        while(i<=j)
        {
            int leftsqr=nums[i]*nums[i];
             int rightsqr=nums[j]*nums[j];

             if(leftsqr>=rightsqr)
             {
                res[id--]=leftsqr;
                i++;
             }

             else
             {
                res[id--]=rightsqr;
                j--;
             }

        }

        return res;
         
    }

   
}