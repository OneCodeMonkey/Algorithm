// AC：
// Runtime: 4 ms, faster than 15.41% of Java online submissions for Squares of a Sorted Array.
// Memory Usage: 41.3 MB, less than 7.26% of Java online submissions for Squares of a Sorted Array.
// 略。
// T:O(n),S:O(n)
//
class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        List<Integer> ret = new LinkedList<>();
        int left = 0, right = 0;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] < 0 && nums[i + 1] >= 0) {
                left = i;
                right = i + 1;
                break;
            }
        }
        // 无正负分界点
        if (left == 0 && right == 0) {
            if (nums[0] >= 0) {
                for (Integer item : nums) {
                    ret.add(item);
                }
            } else {
                for (int i = nums.length - 1; i >= 0; i--) {
                    ret.add(nums[i]);
                }
            }
        } else {
            while (left >= 0 || right < size) {
                if (left < 0) {
                    while (right < size) {
                        ret.add(nums[right]);
                        right++;
                    }
                } else if (right >= size) {
                    while (left >= 0) {
                        ret.add(nums[left]);
                        left--;
                    }
                } else {
                    if (Math.abs(nums[left]) > nums[right]) {
                        ret.add(nums[right]);
                        right++;
                    } else {
                        ret.add(nums[left]);
                        left--;
                    }
                }
            }
        }

        int[] retArr = new int[ret.size()];
        int pos = 0;
        for (Integer i : ret) {
            retArr[pos++] = i * i;
        }

        return retArr;
    }
}