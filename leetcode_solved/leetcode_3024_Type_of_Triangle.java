// Runtime 1 ms Beats 61.30% of users with Java
// Memory 41.51 MB Beats 96.36% of users with Java
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        if (nums[2] == nums[0]) {
            return "equilateral";
        } else if (nums[2] == nums[1] || nums[1] == nums[0]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
