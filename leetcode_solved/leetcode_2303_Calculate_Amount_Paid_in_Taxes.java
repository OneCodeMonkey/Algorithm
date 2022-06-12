// AC: Runtime: 1 ms, faster than 88.89% of Java online submissions for Calculate Amount Paid in Taxes.
// Memory Usage: 45.7 MB, less than 11.11% of Java online submissions for Calculate Amount Paid in Taxes.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ret = 0;
        int prev = 0;
        for (int[] bracket : brackets) {
            if (income <= bracket[0]) {
                ret += (income - prev) * bracket[1] / 100.0;
                break;
            } else {
                ret += (bracket[0] - prev) * bracket[1] / 100.0;
            }
            prev = bracket[0];
        }

        return ret;
    }
}