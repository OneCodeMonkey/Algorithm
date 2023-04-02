// AC: Runtime 4 ms Beats 45.45% 
// Memory 43.1 MB Beats 18.18%
// Hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        int maxTime = 0;
        for (int i : record.keySet()) {
            maxTime = Math.max(maxTime, record.get(i));
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < maxTime; i++) {
            ret.add(new ArrayList<>());
        }
        for (int i : record.keySet()) {
            for (int j = 0; j < record.get(i); j++) {
                ret.get(j).add(i);
            }
        }

        return ret;
    }
}
