// Runtime 109 ms Beats 89.06% 
// Memory 221.37 MB Beats 26.78%
// Use two Map.
// T:O(n), S:O(n)
// 
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        HashMap<Integer, Integer> freqRecord = new HashMap<>();
        for (int i : record.keySet()) {
            int freq = record.get(i);
            freqRecord.merge(freq, 1, Integer::sum);
        }
        for (int num : nums) {
            if (freqRecord.get(record.get(num)) == 1) {
                return num;
            }
        }

        return -1;
    }
}
