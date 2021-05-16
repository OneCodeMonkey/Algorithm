// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
// Memory Usage: 35.9 MB, less than 96.14% of Java online submissions for Middle of the Linked List.
// 略。
// T:O(n), S:O(1)
// 
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
        int count = 0;
        ListNode headCopy = head;
        while (headCopy != null) {
            count++;
            headCopy = headCopy.next;
        }
        int forward = count / 2;
        while (forward-- > 0) {
            head = head.next;
        }
        return head;
    }
}
