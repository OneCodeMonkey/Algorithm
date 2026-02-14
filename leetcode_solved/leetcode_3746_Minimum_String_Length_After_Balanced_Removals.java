// Runtime 3 ms Beats 97.95% 
// Memory 47.17 MB Beats 73.94%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minLengthAfterRemovals(String s) {
        int len = s.length(), countA = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countA++;
            }
        }

        return Math.abs(countA * 2 - len);
    }
}
