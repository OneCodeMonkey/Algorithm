// AC: Runtime 3 ms Beats 80% 
// Memory 42.2 MB Beats 90%
// .
// T:O(nlogk), S:O(1)
//
class Solution {
    public int differenceOfSum(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            if (num >= 10) {
                int raw = num, digitSum = 0;
                while (num > 0) {
                    digitSum += num % 10;
                    num /= 10;
                }
                diff += raw - digitSum;
            }
        }

        return diff;
    }
}
