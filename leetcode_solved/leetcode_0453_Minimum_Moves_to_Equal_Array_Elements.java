// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Minimum Moves to Equal Array Elements.
// Memory Usage: 39 MB, less than 94.82% of Java online submissions for Minimum Moves to Equal Array Elements.
// 思路：观察规律可发现，需要加的次数等于先找到最小的数，然后所有大于这个最小数的数减去此最小数之和，就是答案。
//      虽然没有严格证明，但简单观察规律即可解决此题，验证发现正确。
// T:O(n), S:O(1)
// 
class Solution {
    public int minMoves(int[] nums) {
        int ret = 0;
        int min = 1000000001;
        for (int i: nums) {
            if (i < min) {
                min = i;
            }
        }
        for (int i: nums) {
            if (i != min) {
                ret += i - min;
            }
        }

        return ret;
    }
}