/**
 * AC:
 * Runtime: 8 ms, faster than 76.91% of C++ online submissions for Merge Two Sorted Lists.
 * Memory Usage: 8.8 MB, less than 97.54% of C++ online submissions for Merge Two Sorted Lists.
 *
 * 思路：依次比较 链表1 和 链表2 的头指针的 value，选择较大的塞进一个初始为空的
 * 新链表里.每次塞成功一个节点的 value，则把这个节点往前推一个， node = node->next
 * 最后返回这个组合链表的头指针。
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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode dummy(INT_MIN);
        ListNode* tail = &dummy;

        while(l1 && l2) {
        	if(l1->val < l2->val) {
        		tail->next = l1;
        		l1 = l1->next;
        	} else {
        		tail->next = l2;
        		l2 = l2->next;
        	}
        	tail = tail->next;
        }

        tail->next = l1 ? l1 : l2;	// 有一条链表已经遍历完

        return dummy.next;
    }
};
