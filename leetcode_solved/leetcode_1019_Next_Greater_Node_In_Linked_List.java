// AC: Runtime 40 ms Beats 74.83% 
// Memory 45.9 MB Beats 65.85%
// Monotone Stack.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> listVals = new ArrayList<>();
        while (head != null) {
            listVals.add(head.val);
            head = head.next;
        }
        Stack<Integer> st = new Stack<>();
        int[] ret = new int[listVals.size()];
        for (int i = 0; i < listVals.size(); i++) {
            while (!st.isEmpty() && listVals.get(st.peek()) < listVals.get(i)) {
                ret[st.pop()] = listVals.get(i);
            }
            st.push(i);
        }

        return ret;
    }
}
