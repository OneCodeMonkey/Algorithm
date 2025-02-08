// Runtime 4 ms Beats 100%
// Memory 42.83 MB Beats 100%
// Map.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        int maxOdd = 0, minEven = Integer.MAX_VALUE;
        for (char c : record.keySet()) {
            int count = record.get(c);
            if (count % 2 == 1) {
                maxOdd = Math.max(maxOdd, count);
            } else {
                minEven = Math.min(minEven, count);
            }
        }

        return maxOdd - minEven;
    }
}
