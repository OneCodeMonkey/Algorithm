/**
 * 思路：以每 K 个为一组，反转链表。划分到末尾不足 K 个的不做处理。
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
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(head == NULL || k == 1)
        	return head;
        int num = 0;
        ListNode* preheader = new ListNode(-1);
        preheader->next = head;
        ListNode* cur = preheader, *next, *prev = preheader;
        while(cur = cur->next)
        	num++;
        while(num >= k) {
        	cur = prev->next;
        	next = cur->next;
        	for(int i = 1; i < k; ++i) {
        		cur->next = next->next;
        		next->next = prev->next;
        		prev->next = next;
        		next = cur->next;
        	}
        	prev = cur;
        	num -= k;
        }

        return preheader->next;
    }
};