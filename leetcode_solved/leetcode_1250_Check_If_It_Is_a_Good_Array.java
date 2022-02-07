// AC: Runtime: 3 ms, faster than 70.86% of Java online submissions for Check If It Is a Good Array.
// Memory Usage: 59.6 MB, less than 7.95% of Java online submissions for Check If It Is a Good Array.
// get gcd of the array. the array is "good" only if every two elements are relatively prime.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0], temp = 0;
        for (int num: nums) {
            while (num > 0) {
                temp = gcd % num;
                gcd = num;
                num = temp;
            }
        }

        return gcd == 1;
    }
}