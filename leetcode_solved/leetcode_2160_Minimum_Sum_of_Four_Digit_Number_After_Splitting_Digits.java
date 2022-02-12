// AC: Runtime: 1 ms, faster than 85.03% of Java online submissions for Minimum Sum of Four Digit Number After Splitting Digits.
// Memory Usage: 39.2 MB, less than 92.65% of Java online submissions for Minimum Sum of Four Digit Number After Splitting Digits.// sort and judge by zero digit count.
// sort digit.
// T:O(logn), S:O(1)
// 
class Solution {
    public int minimumSum(int num) {
        List<Integer> record = new ArrayList<>();
        while (num > 0) {
            record.add(num % 10);
            num /= 10;
        }
        Collections.sort(record);

        return (record.get(0) + record.get(1)) * 10 + record.get(2) + record.get(3);
    }
}