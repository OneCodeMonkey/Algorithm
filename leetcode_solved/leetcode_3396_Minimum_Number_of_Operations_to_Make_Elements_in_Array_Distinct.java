// Runtime 2 ms Beats 100.00%
// Memory 44.61 MB Beats 100.00%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length, dupIndex = -1;
        if (len < 3) {
            if (len == 1) {
                return 0;
            } else if (len == 2) {
                return nums[0] == nums[1] ? 1 : 0;
            }
        } else {
            HashSet<Integer> record = new HashSet<>();
            for (int i = len - 1; i >= 0; i--) {
                if (record.contains(nums[i])) {
                    dupIndex = i;
                    break;
                }
                record.add(nums[i]);
            }
        }

        if (dupIndex == -1) {
            return 0;
        }
        return (dupIndex + 1) % 3 == 0 ? (dupIndex + 1) / 3 : ((dupIndex + 1) / 3 + 1);
    }
}
