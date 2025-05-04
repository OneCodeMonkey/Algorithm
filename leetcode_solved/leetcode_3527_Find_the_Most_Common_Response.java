// Runtime 171 ms Beats 24.09% 
// Memory 190.59 MB Beats 69.91%
// Map.
// T:O(n), S:O(n) ~ O(nlogn)
// 
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> record = new HashMap<>();
        for (List<String> list : responses) {
            HashSet<String> tmp = new HashSet<>(list);
            for (String key : tmp) {
                record.merge(key, 1, Integer::sum);
            }
        }
        int maxFreq = 0;
        for (String key : record.keySet()) {
            maxFreq = Math.max(maxFreq, record.get(key));
        }
        List<String> keys = new ArrayList<>();
        for (String key : record.keySet()) {
            if (record.get(key) == maxFreq) {
                keys.add(key);
            }
        }
        Collections.sort(keys);

        return keys.get(0);
    }
}
