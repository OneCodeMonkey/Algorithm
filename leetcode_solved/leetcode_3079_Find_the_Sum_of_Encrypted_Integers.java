// Runtime 2 ms Beats 100.00% of users with Java
// Memory 43.76 MB Beats 50.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            int maxDigit = 1, length = 0;
            while (num > 0) {
                maxDigit = Math.max(maxDigit, num % 10);
                num /= 10;
                length++;
            }
            ret += Integer.parseInt(String.valueOf(maxDigit).repeat(length));
        }

        return ret;
    }
}
