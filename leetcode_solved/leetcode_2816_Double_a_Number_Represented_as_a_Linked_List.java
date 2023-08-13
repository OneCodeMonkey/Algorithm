// AC: Runtime 6 ms Beats 100%
// Memory 45.5 MB Beats 50%
// Linked List operation.
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode doubleIt(ListNode head) {
        List<Integer> digits = new ArrayList<>();
        while (head != null) {
            digits.add(head.val);
            head = head.next;
        }
        int number = 0, extra = 0;
        ListNode ret = new ListNode(-1);
        for (int i = digits.size() - 1; i >= 0; i--) {
            int doubleDigit = 2 * digits.get(i) + extra;
            int val = doubleDigit % 10;
            extra = doubleDigit > 9 ? 1 : 0;
            ListNode temp = new ListNode(val);
            ListNode next = ret.next;
            ret.next = temp;
            temp.next = next;
        }
        if (extra > 0) {
            ListNode temp = new ListNode(extra);
            ListNode next = ret.next;
            ret.next = temp;
            temp.next = next;
        }

        return ret.next;
    }
}
