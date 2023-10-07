// AC: Runtime 48 ms Beats 59.32%
// Memory 47.4 MB Beats 72.88% 
// T:O(n), S:O(n)
// HashMap: Using a binary record to check char count even or odd.
// 
class Solution {
    public int findTheLongestSubstring(String s) {
        int len = s.length(), ret = 0;
        int curBit = 0;
        HashMap<Integer, Integer> bitCountIndex = new HashMap<>();
        bitCountIndex.put(curBit, -1);
        for (int i = 0; i < len; i++) {
            curBit ^= 1 << ("aeiou".indexOf(s.charAt(i)) + 1) >> 1;
            if (!bitCountIndex.containsKey(curBit)) {
                bitCountIndex.put(curBit, i);
            }
            ret = Math.max(ret, i - bitCountIndex.get(curBit));
        }

        return ret;
    }
}
