// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
// Memory Usage: 38.2 MB, less than 64.07% of Java online submissions for Delete Node in a Linked List.
// Directly assign node.next to node is ok.
// T:O(1), S:O(1)
//
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
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}