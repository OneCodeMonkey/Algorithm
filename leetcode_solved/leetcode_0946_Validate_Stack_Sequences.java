// AC: Runtime: 2 ms, faster than 89.25% of Java online submissions for Validate Stack Sequences.
// Memory Usage: 41.4 MB, less than 94.77% of Java online submissions for Validate Stack Sequences.
// stack.
// T:O(n), S:O(n)
//
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st1 = new Stack<>();
        int pos = 0;
        for (int i : pushed) {
            st1.push(i);
            if (i == popped[pos]) {
                while (!st1.empty() && st1.peek() == popped[pos]) {
                    st1.pop();
                    pos++;
                    if (pos >= popped.length) {
                        return true;
                    }
                }
            }
        }

        return pos == popped.length - 1;
    }
}