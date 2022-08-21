// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct Smallest Number From DI String.
// Memory Usage: 40.2 MB, less than 96.82% of Java online submissions for Construct Smallest Number From DI String.
// thought: very nice problem, we need change the view, split the sequence by D and I, if we meet I, then reverse the current 1-N sequence,
// T:O(n), S:O(n)
// 
class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ret = new StringBuilder(), seq = new StringBuilder();
        for (int i = 0; i <= pattern.length(); i++) {
            seq.append((char) ('1' + i));
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                ret.append(seq.reverse());
                seq = new StringBuilder();
            }
        }

        return ret.toString();
    }
}