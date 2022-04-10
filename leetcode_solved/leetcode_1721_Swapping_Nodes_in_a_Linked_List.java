// AC: Runtime: 4 ms, faster than 51.04% of Java online submissions for Swapping Nodes in a Linked List.
// Memory Usage: 57.3 MB, less than 84.47% of Java online submissions for Swapping Nodes in a Linked List.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode headCopy = head, headCopy2 = head;
        while (headCopy != null) {
            size++;
            headCopy = headCopy.next;
        }
        if (k == size - k + 1) {
            return head;
        } else {
            ListNode val1Node = null, val2Node = null;
            for (int i = 0; i <= size - 1 && headCopy2 != null; i++) {
                if (i + 1 == k) {
                    val1Node = headCopy2;
                } else if (i + 1 == size - k + 1) {
                    val2Node = headCopy2;
                }
                if (val1Node != null && val2Node != null) {
                    int tempVal = val1Node.val;
                    val1Node.val = val2Node.val;
                    val2Node.val = tempVal;
                    break;
                }
                headCopy2 = headCopy2.next;
            }

            return head;
        }
    }
}