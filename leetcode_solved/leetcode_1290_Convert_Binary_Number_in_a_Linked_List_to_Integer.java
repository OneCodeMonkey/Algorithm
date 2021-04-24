/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
// Memory Usage: 35.8 MB, less than 99.76% of Java online submissions for Convert Binary Number in a Linked List to Integer.
// 思路：略
// 复杂度：T：O(n), S:O(n)
//
class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> record = new ArrayList<>();
        while (head != null) {
            record.add(head.val);
            head = head.next;
        }
        int ret = 0, size = record.size();
        for (int i = 0; i < size; i++) {
            if (record.get(i) == 1) {
                ret += (int)Math.pow(2, size - 1 - i);
            }
        }
        return ret;
    }
}