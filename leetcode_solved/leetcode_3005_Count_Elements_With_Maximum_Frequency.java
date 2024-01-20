// Runtime 3 ms Beats 100.00% of users with Java
// Memory 42.16 MB Beats 33.33% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int maxFreq = 0, ret = 0;
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
            maxFreq = Math.max(maxFreq, record.get(num));
        }
        for (int key : record.keySet()) {
            if (record.get(key) == maxFreq) {
                ret += maxFreq;
            }
        }

        return ret;
    }
}
