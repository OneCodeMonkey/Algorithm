// AC: Runtime: 3 ms, faster than 76.56% of Java online submissions for First Missing Positive.
// Memory Usage: 100.8 MB, less than 25.90% of Java online submissions for First Missing Positive.
// swap nums[nums[i] - 1] & nums[i], to let every position nums[index] = index + 1, after doing this, check the first nums[index] != index + 1, return index + 1;
// T:O(n), S:O(1)
//
class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            while (nums[i] > 0 && nums[i] <= size && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        return size + 1;
    }
}