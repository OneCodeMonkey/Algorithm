// Solution1: for every element(except first and last), get the left max and right max, 
//          and if min(leftMax, rightMax) > cur, then can trap water: min(leftMax, rightMax) - cur
// AC: Runtime: 70 ms, faster than 5.29% of Java online submissions for Trapping Rain Water.
// Memory Usage: 38 MB, less than 99.03% of Java online submissions for Trapping Rain Water.
// .
// T:O(n^2), S:O(1)
// 
class Solution {
    public int trap(int[] height) {
        int size = height.length, ret = 0;
        if (size >= 3) {
            // the first element and last element cannot trap water.
            for (int i = 1; i < size - 1; i++) {
                int leftMax = 0, rightMax = 0;
                for (int j = 0; j < i; j++) {
                    leftMax = Math.max(leftMax, height[j]);
                }
                for (int j = i + 1; j < size; j++) {
                    rightMax = Math.max(rightMax, height[j]);
                }

                int temp = Math.min(leftMax, rightMax);
                ret += temp > height[i] ? (temp - height[i]) : 0;
            }
        }

        return ret;
    }
}

// Solution2: DP, we store every element's left max element, and right max element, then 
//           the complexity we reduce to O(n)
// AC: Runtime: 1 ms, faster than 85.19% of Java online submissions for Trapping Rain Water.
// Memory Usage: 38.6 MB, less than 47.90% of Java online submissions for Trapping Rain Water.
// dp: to store the left max and right max
// T:O(n), S:O(n)
// 
class Solution {
    public int trap(int[] height) {
        int size = height.length, ret = 0;
        if (size < 3) {
            return ret;
        }
        int[] leftMax = new int[size], rightMax = new int[size];
        leftMax[0] = 0;
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }
        rightMax[size - 1] = 0;
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }

        for (int i = 1; i < size - 1; i++) {
            int temp = Math.min(leftMax[i], rightMax[i]);
            ret += temp > height[i] ? (temp - height[i]) : 0;
        }

        return ret;
    }
}


// Solution3: todo- 单调栈解法
