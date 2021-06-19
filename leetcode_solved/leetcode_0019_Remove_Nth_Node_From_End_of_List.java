// AC: Runtime: 1 ms, faster than 18.11% of Java online submissions for Remove Nth Node From End of List.
// Memory Usage: 36.7 MB, less than 89.53% of Java online submissions for Remove Nth Node From End of List.
// thought: using a faster node, moving forward n - 1 steps, and move forward together, 
//        and delete the node when faster node stops.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headCopy = head;
        // 特殊处理, 因为在 n = 1 时，双指针的快指针根本不走，也就无法拿到要删除的 node 的前一个节点
        if (n == 1) {
            while (head.next != null && head.next.next != null) {
                System.out.println(head.val);
                head = head.next;
            }
            if (head.next == null) {
                return null;
            }
            head.next = null;
            return headCopy;
        }
        int forwardCount = n - 1;
        while (forwardCount-- > 0) {
            headCopy = headCopy.next;
        }
        ListNode headCopy2 = head;
        while (headCopy.next != null) {
            head = head.next;
            headCopy = headCopy.next;
        }
        // delete node
        head.val = head.next.val;
        head.next = head.next.next;

        return headCopy2;
    }
}