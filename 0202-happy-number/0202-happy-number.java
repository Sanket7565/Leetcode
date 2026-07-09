class Solution
 {
    public boolean isHappy(int n) 
    {

        int slow=n;
        int fast=n;
        


        while(true)
        {
            slow=next(slow);
            fast=next(next(fast));

            if(slow==fast)
            
            {
                if(slow==1)
                {
                    return true;
                }
                return false;
            }
        }
         
        
    }


    int next(int n)
        {
            int sum=0;
            while(n>0)
            {
                int digit= n%10;
             sum+=digit*digit;
             n=n/10;

            }

            return sum;
        }
}