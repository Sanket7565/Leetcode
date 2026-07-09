/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        HashSet<ListNode> visited=new HashSet<>();

        while(headA!=null)
        {
            visited.add(headA);
            headA=headA.next;
        }

        while(headB!=null)
        {
            if(visited.contains(headB))
            {
                return headB;
            }

            headB=headB.next;
        }

        return null;
        
    }
}

/* two pointer approach also can be followed without extra space of hashset

headA moves towards end of LL
headB moves towards end of LL

if any node reached end start ahain from head of another list

if headA reached end start again from headB
if headB reaches end start again from headA

when both meets return that node it's the intersection node



*/