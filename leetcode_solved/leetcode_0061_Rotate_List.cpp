// AC
class Solution {
public:
	ListNode* rotateRight(ListNode* head, int k) {
		if (!head) return head;
		int len = 1;
		ListNode *newH, *tail;
		newH = tail = head;
		
		// 获取list 长度
		while (tail->next) {
			tail = tail->next;
			len++;
		}

		tail->next = head;

		// rotate (len - (k % len)) 次
		if (k %= len) {
			for (int i = 0; i < len - k; i++) {
				tail = tail->next;
			}
		}

		newH = tail->next;
		tail->next = NULL;
		return newH;
	}
};
