/**
 * AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
 * Memory Usage: 39.8 MB, less than 69.19% of Java online submissions for Linked List Cycle.
 * 
 * 思路：快慢指针法， T:O(n), S:O(1), n 为链表长度
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // 长度0，1情况
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fasterPointer = head;
        while (head != null) {
            head = head.next;
            if (fasterPointer == null) {
                return false;
            }
            fasterPointer = fasterPointer.next;
            if (fasterPointer == null) {
                return false;
            }
            fasterPointer = fasterPointer.next;
            if (head == fasterPointer) {
                return true;
            }
        }

        return false;
    }
}