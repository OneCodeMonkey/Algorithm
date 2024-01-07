// AC: Runtime 2 ms Beats 33.33% of users with Java
// Memory 43.77 MB Beats 33.33% of users with Java
// Find the two or more even numbers.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int countEven = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                countEven++;
            }
        }

        return countEven >= 2;
    }
}
