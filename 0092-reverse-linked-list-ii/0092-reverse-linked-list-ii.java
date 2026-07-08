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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        ListNode newHead=head;

        ListNode prev=null;
        ListNode prev1=null;

        for(int i=0;i<left-1;i++)
        {
            prev1=newHead;
            newHead=newHead.next;  
            
        }

        ListNode curr=newHead;
        ListNode next=null;

        for(int i=left;i<=right;i++)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        if(prev1 != null)
            prev1.next = prev;
        else
            head = prev;
            
        newHead.next=curr;


        return head;
        
    }
}