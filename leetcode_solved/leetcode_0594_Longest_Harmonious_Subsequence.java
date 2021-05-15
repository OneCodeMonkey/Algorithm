// 法一：map 记录各数字出现的次数
// AC: Runtime: 57 ms, faster than 10.62% of Java online submissions for Longest Harmonious Subsequence.
// Memory Usage: 39.9 MB, less than 60.78% of Java online submissions for Longest Harmonious Subsequence.
// 略。
// T:O(n), S:O(n)
// 
class Solution {
    public int findLHS(int[] nums) {
        int maxLength = 0;
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (Integer i: nums) {
            record.merge(i, 1, Integer::sum);
        }
        if (record.size() < 2) {
            return 0;
        }
        int previous = 0, previousLength = -1;
        for (Integer i: record.keySet()) {
            if (previousLength == -1) {
                previous = i;
                previousLength = record.get(i);
                continue;
            }
            if (i - previous == 1) {
                if (previousLength + record.get(i) > maxLength) {
                    maxLength = previousLength + record.get(i);
                }
            }
            previous = i;
            previousLength = record.get(i);
        }

        return maxLength;
    }
}