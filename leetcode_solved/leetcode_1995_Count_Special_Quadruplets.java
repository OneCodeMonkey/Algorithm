// AC: Runtime: 22 ms, faster than 60.75% of Java online submissions for Count Special Quadruplets.
// Memory Usage: 39.3 MB, less than 19.07% of Java online submissions for Count Special Quadruplets.
// brute-force
// T:O(n^4), S:O(1)
// 
class Solution {
    public int countQuadruplets(int[] nums) {
        int size = nums.length, ret = 0;
        for (int i = 0; i < size - 3; i++) {
            for (int j = i + 1; j < size - 2; j++) {
                for (int k = j + 1; k < size - 1; k++) {
                    for (int t = k + 1; t < size; t++) {
                        if (nums[i] + nums[j] + nums[k] == nums[t]) {
                            ret++;
                        }
                    }
                }
            }
        }

        return ret;
    }
}