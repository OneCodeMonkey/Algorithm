// AC: Runtime: 6 ms, faster than 84.33% of Java online submissions for Sort List.
// Memory Usage: 47.7 MB, less than 43.61% of Java online submissions for Sort List.
// merge sort thoughts.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // step1. cut the list into two halves
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // to make head pointer's end.
        prev.next = null;

        // step2. sort recursively
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // step3. merge two parts of list
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode l = new ListNode(0), p = l;
        while (left != null && right != null) {
            if (left.val < right.val) {
                p.next = left;
                left = left.next;
            } else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }

        if (left != null) {
            p.next = left;
        } else {
            p.next = right;
        }

        return l.next;
    }
}