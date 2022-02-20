// AC: Runtime: 2 ms, faster than 75.00% of Java online submissions for Count Integers With Even Digit Sum.
// Memory Usage: 41.4 MB, less than 25.00% of Java online submissions for Count Integers With Even Digit Sum.
// .
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int countEven(int num) {
        int ret = 0;
        for (int i = 2; i <= num; i++) {
            if (digitSum(i) % 2 == 0) {
                ret++;
            }
        }

        return ret;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}