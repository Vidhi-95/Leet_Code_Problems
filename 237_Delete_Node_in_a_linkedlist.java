/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // changing the value of the node to the value of next node 
        node.val = node.next.val;
        // changing the pointer of node to point to the next to next element
        node.next = node.next.next;
    }
}
