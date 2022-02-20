// AC: Runtime: 12 ms, faster than 100.00% of Java online submissions for Merge Nodes in Between Zeros.
// Memory Usage: 302.6 MB, less than 25.00% of Java online submissions for Merge Nodes in Between Zeros.
// do as it says.
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ret = new ListNode(0), retCopy = ret;
        int curSum = 0;
        boolean skipFirst = false;
        while (head != null) {
            if (head.val == 0) {
                if (!skipFirst) {
                    skipFirst = true;
                } else {
                    retCopy.next = new ListNode(curSum);
                    retCopy = retCopy.next;
                    curSum = 0;
                }
            } else {
                curSum += head.val;
            }
            head = head.next;
        }

        return ret.next;
    }
}