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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        for(curr=head;curr!=null;curr=curr.next){
            for(ListNode temp=curr.next;temp!=null;temp=temp.next){
                if(curr.val==temp.val){
                    curr.next= temp.next;
                }
            }
        }
        return head;
    }
}