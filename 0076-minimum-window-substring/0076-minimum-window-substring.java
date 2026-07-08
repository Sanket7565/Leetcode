class Solution {
    public String minWindow(String s, String t) 
    {
        int needed[]=new int[256];
        int have[]=new int [256];
        int low=0;
        int minLength=Integer.MAX_VALUE;
        int startIndex=0;


        for (int i=0; i<t.length();i++)
        {
            char ch= t.charAt(i);
            needed[ch]++;
        }


        for(int high=0;high<s.length();high++)
        {
            char ch=s.charAt(high);
            have[ch]++;

            while(isValid(have,needed))
            {

                //check if current length (high-low+1) iss less than previousaly calculated length(minlength)
                if(minLength>(high-low+1)) //if yes
                {
                    minLength=high-low+1;  // store the leess length in minlnegth
                    startIndex=low;        //store the starting point as low, window always starts from low
                }

                have[s.charAt(low)]--;
                low++;      

            }

        }

        return minLength==Integer.MAX_VALUE? "" : s.substring(startIndex,startIndex+minLength); //start index =3 minlength=4 so substring should start from 3 and go till length 4 i.e, 3+4=7 so start =3 end =7

        
    }
    boolean isValid(int [] have, int []needed)  

        {
            for(int i=0;i<256;i++)
            {
                if(have[i]<needed[i])
                {
                    return false;
                }
            }

            return true;

        }   
}