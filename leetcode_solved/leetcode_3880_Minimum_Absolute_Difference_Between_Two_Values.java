// Runtime 2 ms Beats 35.21% 
// Memory 46.36 MB Beats 59.43%
// Brute-force.
// T:O(n^2), S:O(n)
// 
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        List<Integer> index1 = new ArrayList<>(), index2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                index1.add(i);
            } else if (nums[i] == 2) {
                index2.add(i);
            }
        }
        if (index1.size() < 1 || index2.size() < 1) {
            return -1;
        }
        int ret = Integer.MAX_VALUE;
        for (int i : index1) {
            for (int j : index2) {
                ret = Math.min(ret, Math.abs(i - j));
                if (ret == 1) {
                    return 1;
                }
            }
        }

        return ret;
    }
}
