// Runtime 2 ms Beats 100.00% of users with Java
// Memory 43.20 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        int ret = 0;
        for (int num : nums) {
            if (record.contains(num)) {
                ret ^= num;
            } else {
                record.add(num);
            }
        }

        return ret;
    }
}
