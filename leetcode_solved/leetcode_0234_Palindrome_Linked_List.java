// 方法二：O(1) space 中部翻转链表法
// AC: Runtime: 4 ms, faster than 96.87% of Java online submissions for Palindrome Linked List.
// Memory Usage: 48.8 MB, less than 82.03% of Java online submissions for Palindrome Linked List.
// 先找到链表中间位置，然后从中间位置翻转下半部分链表，得到原链表尾节点为头的翻转链表，再头尾逐个对比
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tail = reverseList(slow);

        while (tail != null) {
            if (head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}

// 法一：O(n) space 记录再对比法
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