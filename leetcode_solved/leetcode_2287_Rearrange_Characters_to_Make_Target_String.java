// AC: Runtime: 4 ms, faster than 100.00% of Java online submissions for Rearrange Characters to Make Target String.
// Memory Usage: 42.2 MB, less than 50.00% of Java online submissions for Rearrange Characters to Make Target String.
// hashmap
// T:O(n), S:O(1)
// 
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int ret = Integer.MAX_VALUE;
        HashMap<Character, Integer> sRecord = new HashMap<>(), targetRecord = new HashMap<>();
        for (char c : target.toCharArray()) {
            targetRecord.merge(c, 1, Integer::sum);
        }
        for (char c : s.toCharArray()) {
            sRecord.merge(c, 1, Integer::sum);
        }
        for (char c : targetRecord.keySet()) {
            if (!sRecord.containsKey(c)) {
                return 0;
            }
            ret = Math.min(ret, sRecord.get(c) / targetRecord.get(c));
        }

        return ret;
    }
}