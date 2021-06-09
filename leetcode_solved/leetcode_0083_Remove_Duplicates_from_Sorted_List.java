// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
// Memory Usage: 38 MB, less than 86.75% of Java online submissions for Remove Duplicates from Sorted List.
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode headCopy = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                // delete node
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return headCopy;
    }
}