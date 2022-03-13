// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
// Memory Usage: 42.1 MB, less than 87.42% of Java online submissions for Add Two Numbers.
// add bit by bit
// T:O(max(len1, len2)), S:O(max(len1, len2))
// 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int forwarding = 0;
        ListNode ret = new ListNode(-1), retCopy = ret;
        while (l1 != null || l2 != null) {
            int cur1 = 0, cur2 = 0;
            if (l1 != null) {
                cur1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                cur2 = l2.val;
                l2 = l2.next;
            }
            int curBitSum = cur1 + cur2 + forwarding;
            if (curBitSum >= 10) {
                forwarding = 1;
            } else {
                forwarding = 0;
            }
            retCopy.next = new ListNode(curBitSum % 10);
            retCopy = retCopy.next;
        }
        if (forwarding == 1) {
            retCopy.next = new ListNode(forwarding);
        }

        return ret.next;
    }
}