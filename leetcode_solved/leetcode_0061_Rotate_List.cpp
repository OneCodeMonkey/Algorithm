// AC: Runtime: 11 ms, faster than 52.08% of C++ online submissions for Rotate List.
// Memory Usage: 11.8 MB, less than 55.87% of C++ online submissions for Rotate List.
// .
// T:O(n), S:O(n)
// 
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
