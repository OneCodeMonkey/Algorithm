// Solution1: Brute-force
// AC: Runtime 1362 ms Beats 6.25%
// Memory 55.1 MB Beats 14.58%
// Greedy.
// T:O(n ^ 2), S:O(1)
// 
class Solution {
    public long minimumReplacement(int[] nums) {
        long ret = 0;
        int len = nums.length, lastElement = nums[len - 1], curRemain = lastElement;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] > curRemain) {
                if (nums[i] % curRemain == 0) {
                    ret += nums[i] / curRemain - 1;
                } else {
                    int remain = nums[i] % curRemain, base = nums[i] / curRemain, maxRemain = remain;
                    // find all posible split which cause the smallest elements of splitted array is maximum.
                    for (int j = 1; j <= base; j++) {
                        int temp = (remain + j * curRemain) / (j + 1);
                        if (temp > maxRemain) {
                            maxRemain = temp;
                            if (maxRemain == curRemain - 1) {
                                break;
                            }
                        }
                    }

                    ret += base;
                    curRemain = maxRemain;
                }
            } else {
                curRemain = nums[i];
            }
        }

        return ret;
    }
}


// Solution2: direct way.
// AC: Runtime 3 ms Beats 100%
// Memory 54.5 MB Beats 72.92%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public long minimumReplacement(int[] nums) {
        long ret = 0;
        int len = nums.length, lastElement = nums[len - 1], curRemain = lastElement;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] > curRemain) {
                if (nums[i] % curRemain == 0) {
                    ret += nums[i] / curRemain - 1;
                } else {
                    int base = nums[i] / curRemain, maxRemain = nums[i] / (base + 1);

                    // it can be proved that make smallest elements biggest split plan, 
                    // the final answer is nums[i] / ((nums[i] / curRemain) + 1)

                    // The following is the brute-force traversal way.
//                    int remain = nums[i] % curRemain;
//                    // find all posible split which cause the smallest elements of splitted array is maximum.
//                    for (int j = base; j >= 1; j--) {
//                        int temp = (remain + j * curRemain) / (j + 1);
//                        if (temp > maxRemain) {
//                            maxRemain = temp;
//                            if (maxRemain == curRemain - 1) {
//                                break;
//                            }
//                        }
//                    }

                    ret += base;
                    curRemain = maxRemain;
                }
            } else {
                curRemain = nums[i];
            }
        }

        return ret;
    }
}
