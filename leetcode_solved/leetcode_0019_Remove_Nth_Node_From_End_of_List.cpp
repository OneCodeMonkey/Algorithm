class Solution {
public:
	/** 
	 * AC:
	 * Runtime: 4 ms, faster than 89.71% of C++ online submissions for Remove Nth Node From End of List.
	 * Memory Usage: 8.6 MB, less than 23.20% of C++ online submissions for Remove Nth Node From End of List.
	 *
	 * 思路：先count 出链表的长度，然后在截断处的前一个node处，
	 * 令 node->next = node->next->next 就行了
	 */
    ListNode* removeNthFromEnd(ListNode* head, int n) {
    	int size = 0;
    	ListNode* originalHead = head;
    	ListNode* head2 = head;
    	if(n < 1)	// 无意义
    		return NULL;

    	while(head) {
    		size++;
    		head = head->next;
    	}

    	if(size == 1 || n > size)	// 极端情况
    		return NULL;
        if(n == size)   // 极端情况
            return originalHead->next;

    	/**
    	 * 要删的点距 head 为 size - n 个节点，
    	 * 我们在 size - n -1 次后停下，落在它的前一个节点上。
    	 */
    	for(int i = 1; i < (size - n); i++) {
    		head2 = head2->next;
    	}
    	head2->next = head2->next->next;

    	return originalHead;
    }
};
