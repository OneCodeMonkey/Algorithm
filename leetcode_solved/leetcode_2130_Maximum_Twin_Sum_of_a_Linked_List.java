// AC: Runtime: 24 ms, faster than 33.33% of Java online submissions for Maximum Twin Sum of a Linked List.
// Memory Usage: 123.3 MB, less than 16.67% of Java online submissions for Maximum Twin Sum of a Linked List.
// using array. or reverse the latter half of the list, this will be O(1) space.
// T:O(n), S:O(n)
// 
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> record = new ArrayList<>();
        while (head != null) {
            record.add(head.val);
            head = head.next;
        }
        int ret = 0;
        for (int i = 0; i < record.size() / 2; i++) {
            ret = Math.max(ret, record.get(i) + record.get(record.size() - 1 - i));
        }
        return ret;
    }
}