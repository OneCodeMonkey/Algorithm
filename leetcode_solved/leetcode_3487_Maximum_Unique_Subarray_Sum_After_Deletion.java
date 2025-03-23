// Runtime 2 ms Beats 100.00% 
// Memory 42.04 MB Beats 100.00%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int maxSum(int[] nums) {
        int ret = 0, maxNonPosi = Integer.MIN_VALUE;
        HashSet<Integer> record = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                record.add(num);
            } else {
                maxNonPosi = Math.max(maxNonPosi, num);
            }
        }
        if (record.size() == 0) {
            return maxNonPosi;
        }

        for (int i : record) {
            ret += i;
        }

        return ret;
    }
}
