// AC: Runtime 2375 ms Beats 100% 
// Memory 42.5 MB Beats 100%
// Brute-force.
// T:O(n ^ 2), S:O(n)
// 
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxDivisibleInteger = -1, maxDivisibleDivisorCount = -1;
        HashMap<Integer, Integer> numsRecord = new HashMap<>();
        for (int num : nums) {
            numsRecord.merge(num, 1, Integer::sum);
        }
        for (int divisor : divisors) {
            int divisibleCount = 0;
            for (int key : numsRecord.keySet()) {
                if (key >= divisor && key % divisor == 0) {
                    divisibleCount += numsRecord.get(key);
                }
            }
            if (divisibleCount > maxDivisibleDivisorCount) {
                maxDivisibleDivisorCount = divisibleCount;
                maxDivisibleInteger = divisor;
            } else if (divisibleCount == maxDivisibleDivisorCount) {
                maxDivisibleInteger = Math.min(maxDivisibleInteger, divisor);
            }
        }

        return maxDivisibleInteger;
    }
}
