// AC: Runtime: 21 ms, faster than 60.65% of Java online submissions for Maximum Split of Positive Even Integers.
// Memory Usage: 149.3 MB, less than 17.95% of Java online submissions for Maximum Split of Positive Even Integers.
// greedy. always choose smallest even number which not choosed previously. when curSum - cur < cur + 2, add curSum.
// T:O(sqrt(n)), S:O(sqrt(n))
// 
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ret = new LinkedList<>();
        if (finalSum % 2 == 0) {
            long cur = 2;
            while (finalSum - cur >= cur + 2) {
                ret.add(cur);
                finalSum -= cur;
                cur += 2;
            }
            ret.add(finalSum);
        }

        return ret;
    }
}