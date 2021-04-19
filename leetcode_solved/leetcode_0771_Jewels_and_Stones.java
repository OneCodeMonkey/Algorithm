// AC:
// Runtime: 1 ms, faster than 66.25% of Java online submissions for Jewels and Stones.
// Memory Usage: 38.5 MB, less than 10.04% of Java online submissions for Jewels and Stones.
// 思路：略。
// 复杂度: T:O(max(m,n)), S:O(min(m, n)) ，其中m,n为两字符串长度
//
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jewelRecord = new HashSet<>();
        String temp;
        int ret = 0;
        for (int i = 0; i < jewels.length(); i++) {
            temp = String.valueOf(jewels.charAt(i));
            jewelRecord.add(temp);
        }
        for (int i = 0; i < stones.length(); i++) {
            temp = String.valueOf(stones.charAt(i));
            if (jewelRecord.contains(temp)) {
                ret++;
            }
        }

        return ret;
    }
}