// Runtime 95 ms Beats 5.42% 
// Memory 79.55 MB Beats 7.16%
// Prefix sum & DP.
// 注意：给的参数范围是 length <= 10^5，所以有概率超过 int 上限。
// T:O(n), S:O(n)
// 
class Solution {
    public int numOfSubarrays(int[] arr) {
        HashMap<Integer, Long> oddSumCount = new HashMap<>(), evenSumCount = new HashMap<>();
        evenSumCount.put(0, 1L);
        oddSumCount.put(0, 0L);
        int len = arr.length, curSum = 0;
        long ret = 0;
        for (int i = 0; i < len; i++) {
            curSum += arr[i];
            if (curSum % 2 == 1) {
                ret += evenSumCount.get(i);
                oddSumCount.put(i + 1, oddSumCount.get(i) + 1);
                evenSumCount.put(i + 1, evenSumCount.get(i));
            } else {
                ret += oddSumCount.get(i);
                evenSumCount.put(i + 1, evenSumCount.get(i) + 1);
                oddSumCount.put(i + 1, oddSumCount.get(i));
            }

        }

        return (int) (ret % (1000000000 + 7));
    }
}
