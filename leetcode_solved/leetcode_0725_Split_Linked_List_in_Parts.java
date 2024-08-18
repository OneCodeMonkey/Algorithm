// Runtime 1 ms Beats 6.72%
// Memory 43.51 MB Beats 17.19%
// todo-改进下写法，new 这么多 node 导致速度慢
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        List<Integer> sizeList = new ArrayList<>();
        int len = 0;
        ListNode headCopy = head;
        while (headCopy != null) {
            len++;
            headCopy = headCopy.next;
        }
        int base = len / k, remain = len - k * base;
        for (int i = 0; i < k; i++) {
            if (remain > 0) {
                sizeList.add(base + 1);
                remain--;
            } else {
                sizeList.add(base);
            }
        }

        ListNode[] ret = new ListNode[k];
        for (int i = 0; i < k; i++) {
            if (sizeList.get(i) == 0) {
                ret[i] = null;
            } else {
                int pieceSize = sizeList.get(i);
                ListNode pieceHead = new ListNode(-1), pieceHeadCopy = pieceHead;
                for (int j = 0; j < pieceSize; j++) {
                    pieceHeadCopy.next = new ListNode(head.val);
                    head = head.next;
                    pieceHeadCopy = pieceHeadCopy.next;
                }
                ret[i] = pieceHead.next;
            }
        }

        return ret;
    }
}
