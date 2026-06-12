class Solution 
{
    public void sortColors(int[] nums)
     {

        int z=0;
        int o=0;
        int t=0;
        int j=0;

        for( int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
            }
            else if( nums[i]==1)
            {
                o++;
            }
            else
            {
                t++;
            }
        }

        
         while (z>0)
         {
            nums[j]=0;
            z--;
            j++;
         }

         while (o>0)
         {
            nums[j]=1;
            o--;
            j++;
         }

         while (t>0)
         {
            nums[j]=2;
            t--;
            j++;
         }
        
    }
}