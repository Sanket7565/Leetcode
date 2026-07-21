class Solution {
    public int maximumSum(int[] arr) 
    {
        int noDelete=arr[0];
        int oneDelete=0;
        int oneDelete1=0;
        int bestAns=arr[0];


        for(int i=1;i<arr.length;i++)
        {
            int prevNoDelete=noDelete;
            //self
            int self=arr[i];

            //contribute with no deletion
             noDelete=noDelete+arr[i];

             noDelete=Math.max(self,noDelete);

             oneDelete=oneDelete+arr[i];
             oneDelete1=prevNoDelete;

             oneDelete=Math.max(oneDelete,oneDelete1);

             bestAns=Math.max(bestAns,Math.max(oneDelete,noDelete));

        }

        return bestAns;
        
    }
}