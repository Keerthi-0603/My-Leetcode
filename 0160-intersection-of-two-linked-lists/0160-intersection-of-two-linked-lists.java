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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode p1=headA;
        ListNode p2=headB;
        for(p1=headA;p1!=null;p1=p1.next){
            for(p2=headB;p2!=null;p2=p2.next){
                if(p1==p2){
                    return p1;
                }
            }
        }
        return p1;
    }
}