// AC:
// Runtime: 1 ms, faster than 97.80% of Java online submissions for Intersection of Two Linked Lists.
// Memory Usage: 41.5 MB, less than 80.54% of Java online submissions for Intersection of Two Linked Lists.
// 思路：计算出链表长度差，让短的指针头先走长度差的步数，再同时同速走看能否相遇
// T:O(max(lenA,lenB)), S:O(1)
//
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode tempHead = headA;
        while (tempHead != null) {
            lenA++;
            tempHead = tempHead.next;
        }
        tempHead = headB;
        while (tempHead != null) {
            lenB++;
            tempHead = tempHead.next;
        }
        
        int forward = Math.max(lenA, lenB) - Math.min(lenA, lenB);
        if (lenA > lenB) {
            while (forward-- > 0) {
                headA = headA.next;
            }
        } else {
            while (forward-- > 0) {
                headB = headB.next;
            }
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}