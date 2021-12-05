// AC: Runtime: 4 ms, faster than 40.00% of Java online submissions for Delete the Middle Node of a Linked List.
// Memory Usage: 63.9 MB, less than 40.00% of Java online submissions for Delete the Middle Node of a Linked List.
// two pointer way.
// T:O(n), S:O(1)
// 
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slowPrev = null, slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slowPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            slowPrev.next = slow.next;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }
}