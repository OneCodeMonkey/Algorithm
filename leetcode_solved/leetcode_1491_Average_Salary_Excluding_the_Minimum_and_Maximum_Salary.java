// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
// Memory Usage: 36.7 MB, less than 50.55% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
// .
// T:O(n), S:O(1)
//
class Solution {
    public double average(int[] salary) {
        int max = 0, min = Integer.MAX_VALUE, sum = 0, size = salary.length;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }
        return (sum - max - min) / ((size - 2) * 1.00000);
    }
}