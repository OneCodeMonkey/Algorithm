// AC: Runtime: 17 ms, faster than 55.91% of Java online submissions for Maximum Length of Pair Chain.
// Memory Usage: 51.8 MB, less than 24.09% of Java online submissions for Maximum Length of Pair Chain.
// greedy: sort by pair[1], and concat by sorted order, if pair[i][1] < pair[i + 1][0], then choose pair[i], and so on to pair[i + 2], pair[i + 3].
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> { return a[1] - b[1];});
        int previousTail = Integer.MIN_VALUE, ret = 0;
        for (int[] pair: pairs) {
            if (pair[0] > previousTail) {
                previousTail = pair[1];
                ret++;
            }
        }

        return ret;
    }
}