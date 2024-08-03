// Runtime 0 ms Beats 100.00%
// Memory 44.17 MB Beats 45.78%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumTotal = 0, sumSmall = 0;
        for (int num : nums) {
            if (num < 10) {
                sumSmall += num;
            }
            sumTotal += num;
        }

        return sumSmall * 2 != sumTotal;
    }
}
