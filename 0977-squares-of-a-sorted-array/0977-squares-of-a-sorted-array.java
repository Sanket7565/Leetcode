class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
         List<Integer> neg=new ArrayList();
         List<Integer> pos=new ArrayList();

         int res[]=new int[nums.length];

         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]<0)
            {
                neg.add(nums[i]*nums[i]);
            }
            else
            {
                pos.add(nums[i]*nums[i]);
            }
         }



        int j=neg.size()-1;
        int k=0;
         int id=0;

         while (j>=0 && k<pos.size())
         {
            if(neg.get(j)<=pos.get(k))
            {
                res[id++]=neg.get(j--);
            }
            else
            {
                 res[id++]=pos.get(k++);
            }
         }

         while(j>=0)
         {
            res[id++]=neg.get(j--);
         }

         while (k<pos.size())
         {
          res[id++]=pos.get(k++);  
         }

         return res;
    }

   
}