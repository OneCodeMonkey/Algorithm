// AC:
// Runtime: 7 ms, faster than 47.01% of Java online submissions for Palindrome Linked List.
// Memory Usage: 51.2 MB, less than 44.55% of Java online submissions for Palindrome Linked List.
// 略
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> record = new ArrayList<>();
        while (head != null) {
            record.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < record.size() / 2; i++) {
            if (record.get(i).intValue() != record.get(record.size() - 1 - i).intValue()) {
                return false;
            }
        }
        return true;
    }
}