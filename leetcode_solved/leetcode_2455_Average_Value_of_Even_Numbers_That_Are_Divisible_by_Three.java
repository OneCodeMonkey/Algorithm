// AC: Runtime 1 ms Beats 100% 
// Memory 42.5 MB Beats 100%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, count = 0;
        for (int i : nums) {
            if (i % 6 == 0) {
                sum += i;
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }
}
