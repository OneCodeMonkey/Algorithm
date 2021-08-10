// Solution: space O(n) method
// AC: Runtime: 2 ms, faster than 38.26% of Java online submissions for Reorder List.
// Memory Usage: 41.5 MB, less than 81.90% of Java online submissions for Reorder List.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> record = new ArrayList<>();
        while (head != null) {
            record.add(head);
            head = head.next;
        }
        int size = record.size(), left = 1, right = size - 1;
        ListNode temp = record.get(0);
        ListNode ret = temp;
        while (left <= right) {
            temp.next = record.get(right);
            temp = temp.next;
            right--;
            if (left < right) {
                temp.next = record.get(left);
                temp = temp.next;
                left++;
            }
        }
        temp.next = null;

        head = ret;
    }
}