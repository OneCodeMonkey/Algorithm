// AC: Runtime: 1 ms, faster than 27.17% of Java online submissions for Remove Duplicates from Sorted List II.
// Memory Usage: 38.6 MB, less than 34.10% of Java online submissions for Remove Duplicates from Sorted List II.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> dup = new HashSet<>();
        ListNode headCopy = head;
        int prev = Integer.MIN_VALUE;
        while (headCopy != null) {
            if (headCopy.val == prev) {
                dup.add(headCopy.val);
            }
            prev = headCopy.val;
            headCopy = headCopy.next;
        }

        ListNode headCopy2 = head, prevNode = head;
        while (headCopy2 != null && headCopy2.next != null) {
            if (dup.contains(headCopy2.val)) {
                headCopy2.val = headCopy2.next.val;
                headCopy2.next = headCopy2.next.next;
            } else {
                prevNode = headCopy2;
                headCopy2 = headCopy2.next;
            }
        }
        // handle the head pointer itself
        if (headCopy2 != null && dup.contains(headCopy2.val)) {
            if (headCopy2 == head) {
                return null;
            }
            prevNode.next = null;
        }

        return head;
    }
}