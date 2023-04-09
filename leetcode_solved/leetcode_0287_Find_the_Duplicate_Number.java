// Solution 1: O(n) space
// AC: Runtime 25 ms Beats 30.54% 
// Memory 60.9 MB Beats 14.37%
// HashSet.
// T:O(n), S:O(n)
// 
class Solution {
    public int findDuplicate(int[] nums) {
        int size = nums.length;
        HashSet<Integer> record = new HashSet<>();
        for (int i: nums) {
            if (record.contains(i)) {
                return i;
            }
            record.add(i);
        }
        return -1;
    }
}

// Solution 2: Sign on original array.
// AC: Runtime 4 ms Beats 87.97% 
// Memory 59.7 MB Beats 70.33%
// Notice: This way will change the array value.
// T:O(n), S:O(1)
// 
class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[Math.abs(nums[i])] < 0) {
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i])] *= -1;
        }

        return 0;
    }
}

// Solution 3: Sort
// AC: Runtime 38 ms Beats 18.98% 
// Memory 60.1 MB Beats 44%
// Sort & compare adjacent elements.
// T:O(nlogn), S:O(1)
//
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return 0;
    }
}

// Solution 4: Cycle Detection, see@https://en.wikipedia.org/wiki/Cycle_detection
// todo
