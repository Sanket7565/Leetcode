class Solution 
{
    public int lengthOfLastWord(String s) 
    {
       String copy=s.trim();

       int index=copy.lastIndexOf(" ");
       int length=copy.length()-index-1;

       return length;
    }
}
