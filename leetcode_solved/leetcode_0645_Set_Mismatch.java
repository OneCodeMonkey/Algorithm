// 法2： O(1) space
//
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for (int i : nums) {
            if (nums[Math.abs(i) - 1] < 0) {
                res[0] = Math.abs(i);
            } else {
                nums[Math.abs(i) - 1] *= -1;
            }
        }
        for (int i=0;i<nums.length;i++) {
            if (nums[i] > 0) res[1] = i+1;
        }
        return res;
    }
}

// AC: Runtime: 17 ms, faster than 12.63% of Java online submissions for Set Mismatch.
// Memory Usage: 52.2 MB, less than 5.24% of Java online submissions for Set Mismatch.
// 。
// T:O(n), S:O(n)
// 
class Solution {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length, dup = 0, sum = 0;
        HashSet<Integer> record = new HashSet<>();
        for (int num : nums) {
            sum += num;
            if (!record.contains(num)) {
                record.add(num);
            } else {
                dup = num;
            }
        }
        int mis = size * (size + 1) / 2 - sum + dup;

        return new int[]{dup, mis};
    }
}