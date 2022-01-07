// AC: Runtime: 27 ms, faster than 9.52% of Java online submissions for Pairs of Songs With Total Durations Divisible by 60.
// Memory Usage: 51.4 MB, less than 20.63% of Java online submissions for Pairs of Songs With Total Durations Divisible by 60.
// hashmap to record mod left of former elements.
// T:O(n), S:O(n)
// 
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i : time) {
            int modLeft = i % 60, modLeft2 = (60 - modLeft) % 60;
            if (record.containsKey(modLeft2)) {
                ret += record.get(modLeft2);
            }
            record.merge(modLeft, 1, Integer::sum);
        }

        return ret;
    }
}