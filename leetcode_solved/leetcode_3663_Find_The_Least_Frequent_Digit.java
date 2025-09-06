// Runtime 3 ms Beats 100.00% 
// Memory 41.35 MB Beats 100.00%
// Map.
// T:O(logn), S:O(logn)
// 
class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer, Integer> record = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            record.merge(digit, 1, Integer::sum);
        }
        int ret = 0, minOccurence = Integer.MAX_VALUE;
        for (int key : record.keySet()) {
            if (record.get(key) < minOccurence) {
                ret = key;
                minOccurence = record.get(key);
            } else if (record.get(key) == minOccurence) {
                ret = Math.min(ret, key);
            }
        }

        return ret;
    }
}
