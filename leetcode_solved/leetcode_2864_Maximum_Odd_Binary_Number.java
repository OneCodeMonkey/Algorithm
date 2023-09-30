// AC: Runtime 2 ms Beats 100%
// Memory 43.3 MB Beats 100%
// Greedy.
// T:O(n), S:O(n)
// 
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length(), countOne = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOne++;
            }
        }
        StringBuilder ret = new StringBuilder();
        ret.append("1");
        ret.append("0".repeat(len - countOne));
        ret.append("1".repeat(countOne - 1));

        return ret.reverse().toString();
    }
}
