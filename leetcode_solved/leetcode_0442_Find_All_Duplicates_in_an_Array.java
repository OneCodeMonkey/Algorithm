// AC: Runtime: 6 ms, faster than 53.35% of Java online submissions for Find All Duplicates in an Array.
// Memory Usage: 47.1 MB, less than 96.48% of Java online submissions for Find All Duplicates in an Array.
// thought: as it mentioned that 1 <= nums[i] <= 10^5, if one element appears, we set nums[elem - 1] += 10^5, so we can check
// whether elem exist in the following checks.
// T:O(n), S:O(1)
// 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp > 1e5) {
                temp -= 1e5;
            }
            // element appered before.
            if (nums[temp - 1] > 1e5) {
                ret.add(temp);
            } else {    // first appear
                // set to a larger sign.
                nums[temp - 1] += 1e5;
            }
        }

        return ret;
    }
}

// solution2 
// AC: Runtime: 6 ms, faster than 53.35% of Java online submissions for Find All Duplicates in an Array.
// Memory Usage: 47 MB, less than 98.34% of Java online submissions for Find All Duplicates in an Array.
// like above, sign the nums[elem - 1] to its negative is much easier.
// T:O(n), S:O(1)
// 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp < 0) {
                temp = -temp;
            }
            // element appered before.
            if (nums[temp - 1] < 0) {
                ret.add(temp);
            } else {    // first appear
                // set to a larger sign.
                nums[temp - 1] *= -1;
            }
        }

        return ret;
    }
}