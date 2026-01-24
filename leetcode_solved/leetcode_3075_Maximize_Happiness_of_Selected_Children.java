// Runtime 42 ms Beats 80.26% 
// Memory 109.37 MB Beats 36.64%
// Sort.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int len = happiness.length;
        long sum1 = 0;
        for (int i = len - 1; i >= len - k; i--) {
            sum1 += Math.max(0, happiness[i] - (len - 1 - i));
        }

        return sum1;
    }
}
