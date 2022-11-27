// Runtime 691 ms Beats 25% 
// Memory 117.2 MB Beats 25%
// treemap & brute-force
// T:O(n^3), S:O(n)
//
class Solution {
    public int unequalTriplets(int[] nums) {
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        int ret = 0;
        if (record.size() > 2) {
            int[] keys = new int[record.size()];
            int pos = 0;
            for (int i : record.keySet()) {
                keys[pos++] = i;
            }
            for (int i = 0; i < record.size() - 2; i++) {
                for (int j = i + 1; j < record.size() - 1; j++) {
                    for (int k = j + 1; k < record.size(); k++) {
                        ret += record.get(keys[i]) * record.get(keys[j]) * record.get(keys[k]);
                    }
                }
            }
        }

        return ret;
    }
}
