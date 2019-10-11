/**
 * AC：
 * Runtime: 4 ms, faster than 98.93% of C++ online submissions for Reverse Linked List.
 * Memory Usage: 9.1 MB, less than 100.00% of C++ online submissions for Reverse Linked List.
 *
 * 思路:反转一个单链表。
 * 新建一个空节点做操作起始点，然后从这个节点开始，依次做循环性的交换链表节点的操作。
 * 最终这个空节点就挂满的原链表的反向所有节点。然后返回这个空节点的 nex 即反转后的头指针。
 * T:O(n) S:O(1)
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
    ListNode* reverseList(ListNode* head) {
    	ListNode *pre = new ListNode(0), *cur = head;
    	pre->next = head;
    	while(cur && cur->next) {
    		ListNode *temp = pre->next;		// 依次
    		pre->next = cur->next;
    		cur->next = cur->next->next;	// 循环依据自增
    		pre->next->next = temp;
    	}

    	return pre->next;	// 返回新的头指针
    }
};