// AC: Runtime 8 ms Beats 92.76% of users with Java
// Memory 44.58 MB Beats 71.97% of users with Java
// Greedy: Try to move from the left, if char is '1', move to the left-most position which is not '1'
// T:O(n), S:O(1)
// 
class Solution {
    public long minimumSteps(String s) {
        int n = s.length(), leftPos = n - 1;
        long ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ret += leftPos - i;
                leftPos--;
            }
        }

        return ret;
    }
}
