class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int low=0;
        Map<Character,Integer> map=new HashMap<>();
        int result= Integer.MIN_VALUE;

        if(s.length()==0 )
        {
            return 0;
        }
        
        for(int high=0; high<s.length();high++)
        {
            char currentChar=s.charAt(high);

            map.put(currentChar,map.getOrDefault(currentChar,0)+1);

            while(map.get(currentChar)>1)
            {
                char leftChar=s.charAt(low);
                 
                map.put(leftChar,map.get(leftChar)-1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                low++;

            }

            result=Math.max(result,high-low+1);
        }

        return result;
        
    }
}