// Runtime 22 ms Beats 27.43%
// Memory 69.94 MB Beats 19.38%
// Just cycle this linked list and check value exists.
// T:O(n + m), S:O(n)
// 
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        ListNode ret = new ListNode(-1), retCopy = ret;
        while (head != null) {
            if (!numSet.contains(head.val)) {
                retCopy.next = new ListNode(head.val, null);
                retCopy = retCopy.next;
            }
            head = head.next;
        }

        return ret.next;
    }
}
