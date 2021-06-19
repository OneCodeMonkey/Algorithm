// AC: Runtime: 3 ms, faster than 47.91% of Java online submissions for Sort Array By Parity II.
// Memory Usage: 39.9 MB, less than 84.57% of Java online submissions for Sort Array By Parity II.
// in-place swap
// T:O(n), S:O(1)
// 
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int size = nums.length, evenPos = size - 2, oddPos = size - 1;
        for (int i = 0; i < size; i++) {
            int temp;
            if (nums[i] % 2 == 0 && i % 2 == 1) {
                while (evenPos >= 0 && nums[evenPos] % 2 == 0) {
                    evenPos -= 2;
                }
                if (evenPos < 0) {
                    continue;
                }
                temp = nums[i];
                nums[i] = nums[evenPos];
                nums[evenPos] = temp;
                evenPos -= 2;
            } else if (nums[i] % 2 == 1 && i % 2 == 0) {
                while (oddPos >= 0 && nums[oddPos] % 2 == 1) {
                    oddPos -= 2;
                }
                if (oddPos < 0) {
                    continue;
                }
                temp = nums[i];
                nums[i] = nums[oddPos];
                nums[oddPos] = temp;
                oddPos -= 2;
            }
        }

        return nums;
    }
}