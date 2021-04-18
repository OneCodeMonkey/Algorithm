/**
 * AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
 *     Memory Usage: 38.9 MB, less than 81.24% of Java online submissions for Linked List Cycle II.
 * 
 * 思路：快慢指针法。 细节的是需要证明当快慢两指针相遇时，慢指针再走一倍已走过的路程，最终会停在环处。
 * 复杂度：T:O(n), S:O(1)
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // 坑：注意链表 length >= 0，单独处理0的情况，否则 fasterPointer.next 抛空指针异常
        if (head == null) {
            return head;
        }

        ListNode slowerPointer = head, fasterPointer = head;
        while (fasterPointer.next != null && fasterPointer.next.next != null) {
            slowerPointer = slowerPointer.next;
            fasterPointer = fasterPointer.next.next;
            // 有环
            // 快慢指针相遇
            if (slowerPointer == fasterPointer) {
                // 设置第二个慢指针，从链表头开始。可以证明第二个慢指针与第一个慢指针会在链表的环处相遇。
                ListNode tempPointer = head;
                while (slowerPointer != tempPointer) {
                    slowerPointer = slowerPointer.next;
                    tempPointer = tempPointer.next;
                }
                return slowerPointer;
            }
        }

        // 无环
        return fasterPointer.next == null ? fasterPointer.next : fasterPointer.next.next;
    }
}