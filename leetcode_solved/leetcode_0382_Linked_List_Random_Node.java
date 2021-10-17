// AC: Runtime: 16 ms, faster than 40.31% of Java online submissions for Linked List Random Node.
// Memory Usage: 40.9 MB, less than 67.54% of Java online submissions for Linked List Random Node.
// .
// T: avg:O(2), min:O(1), S:O(1)
// 
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
    private ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        ListNode node = head;
        Random rand = new Random();
        int val = node.val;
        for (int i = 1; node.next != null; i++) {
            node = node.next;
            if (rand.nextInt(i + 1) == i) {
                val = node.val;
            }
        }

        return val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(head);
 * int param_1 = obj->getRandom();
 */