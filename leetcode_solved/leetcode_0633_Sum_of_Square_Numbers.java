// AC:
// Runtime: 2 ms, faster than 92.52% of Java online submissions for Sum of Square Numbers.
// Memory Usage: 35.5 MB, less than 80.49% of Java online submissions for Sum of Square Numbers.
// 滑动窗口
class Solution {
    public boolean judgeSquareSum(int c) {
        int sqrtC = (int) Math.sqrt((double)c);
        int left = 0, right = sqrtC;
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
