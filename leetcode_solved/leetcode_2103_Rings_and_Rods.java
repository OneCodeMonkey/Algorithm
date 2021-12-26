// AC: Runtime: 1 ms, faster than 60.00% of Java online submissions for Rings and Rods.
// Memory Usage: 37.3 MB, less than 80.00% of Java online submissions for Rings and Rods.
// hashmap and hashset
// T:O(n), S:O(n)
//
class Solution {
    public int countPoints(String rings) {
        HashMap<Integer, HashSet<Character>> record = new HashMap<>();
        for (int i = 0; i < rings.length() / 2; i ++) {
            int index = Integer.parseInt(String.valueOf(rings.charAt(2 * i + 1)));
            if (record.containsKey(index)) {
                record.get(index).add(rings.charAt(2 * i));
            } else {
                HashSet<Character> tempSet = new HashSet<>();
                tempSet.add(rings.charAt(2 * i));
                record.put(index, tempSet);
            }
        }

        int ret = 0;
        for (int index: record.keySet()) {
            if (record.get(index).size() == 3) {
                ret++;
            }
        }

        return ret;
    }
}