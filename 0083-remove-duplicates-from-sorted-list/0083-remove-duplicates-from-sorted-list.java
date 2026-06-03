/**
 * Definition for singly-linked list.

 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }


 */
class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head==null)
        {
            return head;
        }

        ListNode tempHead=head;
        ListNode movingNext=head.next;

        while(movingNext!=null)
        {
            if(movingNext.val==tempHead.val)
            {
                movingNext=movingNext.next;
            }
            else
            {
                tempHead.next=movingNext;
                tempHead=movingNext;
                movingNext=movingNext.next;
            }
        }
        // Remove leftover links to duplicate nodes
        tempHead.next = null;

        return head;
    }
}