// Solution 1: Using monotonous stack
// Time: Runtime 733 ms Beats 14.29% 
// Memory 63 MB Beats 71.43%
// monotonous stack.
// T:O(n), S:O(n)
// 
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> nonIncreasing = new Stack<>();
        while (head != null) {
            if (nonIncreasing.empty()) {
                nonIncreasing.add(head);
            } else {
                while (!nonIncreasing.isEmpty() && head.val > nonIncreasing.peek().val) {
                    nonIncreasing.pop();
                }
                nonIncreasing.add(head);
            }

            head = head.next;
        }

        ListNode curNode = null;
        while (!nonIncreasing.isEmpty()) {
            ListNode node = nonIncreasing.pop();
            System.out.println(node.val);
            if (curNode == null) {
                curNode = node;
            } else {
                node.next = curNode;
                curNode = node;
            }
        }

        return curNode;
    }
}

// Solution 2: Using single linked-list reverse
// Runtime 11 ms Beats 85.71% 
// Memory 59.7 MB Beats 71.43%
// reverse list &&  get the non-decreasing sequence && reverse the final list
// T:O(n), S:O(1)
// 
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode tail = reverseList(head), removed = new ListNode(-1), removedCopy = removed;
        int maxVal = tail.val;
        // remain non-decreasing sequence
        while (tail != null) {
            if (tail.val >= maxVal) {
                removedCopy.next = tail;
                removedCopy = removedCopy.next;
                maxVal = tail.val;
            }
            tail = tail.next;
        }
        removedCopy.next = null;

        return reverseList(removed.next);
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp, prev = null;
        while (head != null) {
            temp = new ListNode(head.val);
            temp.next = prev;
            prev = temp;

            head = head.next;
        }

        return prev;
    }
}