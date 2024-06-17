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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> res=new ArrayList();
        ListNode curr=head;
        int mid;
        while(curr!=null){
            res.add(curr);
            curr=curr.next;
        }
        
        mid=res.size()/2;
        return res.get(mid);
    }
}