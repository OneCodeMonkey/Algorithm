// AC: Runtime: 2 ms, faster than 50.00% of Java online submissions for Make Array Zero by Subtracting Equal Amounts.
// Memory Usage: 41.7 MB, less than 50.00% of Java online submissions for Make Array Zero by Subtracting Equal Amounts.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                record.add(num);
            }
        }
        return record.size();
    }
}