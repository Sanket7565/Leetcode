class Solution
{
    public int maximumSum(int[] arr)
    {
        int noDelete = arr[0];
        int oneDelete = 0;

        int bestAns = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            int prevNoDelete = noDelete;

            // self
            int self = arr[i];
            // contribute without deletion
            noDelete = noDelete + arr[i];

            noDelete = Math.max(self, noDelete);

            // deletion already happened
            oneDelete = oneDelete + arr[i];

            // delete current element
            int deleteCurrent = prevNoDelete;

            oneDelete = Math.max(oneDelete, deleteCurrent);

            // update global answer
            bestAns = Math.max(bestAns,
                               Math.max(noDelete, oneDelete));
        }

        return bestAns;
    }
}