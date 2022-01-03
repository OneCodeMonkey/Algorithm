// AC: Runtime: 2 ms, faster than 20.00% of Java online submissions for Check if All A's Appears Before All B's.
// Memory Usage: 38.6 MB, less than 20.00% of Java online submissions for Check if All A's Appears Before All B's.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean checkString(String s) {
        int bCount = 0;
        for (char c: s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else {
                if (bCount > 0) {
                    return false;
                }
            }
        }

        return true;
    }
}