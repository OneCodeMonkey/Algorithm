// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Minimum Number of Increments on Subarrays to Form a Target Array.
// Memory Usage: 51.4 MB, less than 63.97% of Java online submissions for Minimum Number of Increments on Subarrays to Form a Target Array.
// if current element is larger than former one, we need to (i - prev) steps to make up the difference.
// T:O(n), S:O(1)
// 
class Solution {
    public int minNumberOperations(int[] target) {
        int ret = 0, prev = 0;
        for (int i:target) {
            if (i > prev) {
                ret += i - prev;
            }
            prev = i;
        }

        return ret;
    }
}