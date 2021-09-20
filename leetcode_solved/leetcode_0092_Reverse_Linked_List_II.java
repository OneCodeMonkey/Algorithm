// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List II.
// Memory Usage: 36.5 MB, less than 82.11% of Java online submissions for Reverse Linked List II.
// find the start position and end position of range to be reversed. and record the range values. then assign it to list nodes in reverse order.
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode fast = head, slow = head;
        int length = right - left;
        while (length-- > 0) {
            fast = fast.next;
        }

        // find the start position and end position.
        int leftCopy = left - 1;
        while (leftCopy-- > 0) {
            slow = slow.next;
            fast = fast.next;
        }

        // record the range values.
        ListNode temp = slow;
        List<Integer> record = new ArrayList<>();
        record.add(slow.val);
        while (temp != fast) {
            temp = temp.next;
            record.add(temp.val);
        }

        // assign values in reverse order.
        int pos = record.size() - 1;
        slow.val = record.get(pos--);
        while (slow != fast) {
            slow = slow.next;
            slow.val = record.get(pos--);
        }

        return head;
    }
}