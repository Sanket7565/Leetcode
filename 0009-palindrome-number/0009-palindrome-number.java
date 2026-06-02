class Solution {
    public boolean isPalindrome(int x) 
    {
        int copy=x,temp,sum=0;


        if( x<0)
        {
            return false;
        }
        else
        {
            while(x>0)
            {
                temp=x%10;
                sum=sum*10+temp;
                x=x/10;


        
            }

          if(sum==copy)
          {
              return true;
          }
          else{
              return false;
          }
            
        }
     
   }
}