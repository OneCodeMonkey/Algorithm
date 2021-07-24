// AC: Runtime: 2 ms, faster than 98.16% of Java online submissions for Add Two Numbers II.
// Memory Usage: 39.3 MB, less than 68.00% of Java online submissions for Add Two Numbers II.
// first reverse, then accumulate the two numbers. Notice that the answer is reversed output, that is high bit is in the front.
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start1 = reverseList(l1), start2 = reverseList(l2), retHead;
        List<Integer> ret = new ArrayList<>();
        int forwarding = 0;
        while (start1 != null || start2 != null) {
            int bit1 = 0, bit2 = 0;
            if (start1 != null) {
                bit1 = start1.val;
                start1 = start1.next;
            }
            if (start2 != null) {
                bit2 = start2.val;
                start2 = start2.next;
            }
            if (bit1 + bit2 + forwarding >= 10) {
                ret.add((bit1 + bit2 + forwarding) % 10);
                forwarding = 1;
            } else {
                ret.add(bit1 + bit2 + forwarding);
                forwarding = 0;
            }
        }
        if (forwarding > 0) {
            ret.add(forwarding);
        }
        retHead = new ListNode(ret.get(ret.size() - 1));
        ListNode copy = retHead;
        for (int i = ret.size() - 2; i >= 0; i--) {
            ListNode next = new ListNode(ret.get(i));
            copy.next = next;
            copy = next;
        }

        return retHead;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, temp = head;
        while (head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
}