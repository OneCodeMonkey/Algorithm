/**
 * AC：Runtime: 48 ms, faster than 82.11% of C++ online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 16.7 MB, less than 94.44% of C++ online submissions for Intersection of Two Linked Lists.
 *
 * 思路：我们定义两个从 A 和 B 链表分别开始的头指针。travel(A)表示第一个
 * 指针走过的长度。当有一个指针走到尽头时，分别跳到另一个指针的头部继续走。
 * 这样，当只跳转一次后，注意到相交时，有 travel(A) = travel(B),这个链节点
 * 就是交点。
 * T：O（m+n)   m,n 分别是两个链表的长度。
 *
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* curA = headA, *curB = headB;
        while(curA != curB) {
        	curA = curA ? curA->next : headB;	// 走到尽头就跳到另一个链表的头，继续走
        	curB = curB ? curB->next : headA;	// 走到尽头就跳到另一个链表的头，继续走
        }
        return curA;
    }
};