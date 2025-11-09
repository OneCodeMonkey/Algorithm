// Runtime 3 ms Beats 46.67% 
// Memory 42.90 MB Beats 50.00%
// Map.
// T:O(n), S:O(n)
// 
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i : nums) {
            record.merge(i, 1, Integer::sum);
        }
        int ret = 0;
        for (int i : record.keySet()) {
            if (record.get(i) % k == 0) {
                ret += i * record.get(i);
            }
        }

        return ret;
    }
}
