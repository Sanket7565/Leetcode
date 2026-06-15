class Solution 
{
    public int strStr(String haystack, String needle) 
    {
         int left=0; 
         int right=0;
         int i=0;

        while(right<haystack.length())
    
        {
            if(needle.charAt(i)==haystack.charAt(right))
            {
                right++;
                i++;

                if( i==needle.length())
                {
                    return left;
                }
            }
            else
            {
                left++;
                right=left;
                i=0;

            }
        }

        return -1;

        
    }
}