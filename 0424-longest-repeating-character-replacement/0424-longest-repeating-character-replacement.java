class Solution {
    public int characterReplacement(String s, int k) 
    {
        int low=0;
        int maxLength=Integer.MIN_VALUE;
        int maxFreq=0;

        Map<Character,Integer> map= new HashMap<>();

        for(int high=0;high<s.length();high++)
        {
            char current= s.charAt(high);

            map.put(current, map.getOrDefault(current,0)+1);

            maxFreq=Math.max(maxFreq,map.get(current));

            while(((high-low+1)-maxFreq)>k)
            {
                char left= s.charAt(low);
                map.put(left,map.get(left)-1);

                low++;
            }

            maxLength=Math.max(maxLength,(high-low+1));
        }

        return maxLength;
        
    }
}