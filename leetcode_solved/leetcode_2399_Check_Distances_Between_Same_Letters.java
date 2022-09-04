// AC: Runtime: 3 ms, faster than 43.75% of Java online submissions for Check Distances Between Same Letters.
// Memory Usage: 42.1 MB, less than 93.75% of Java online submissions for Check Distances Between Same Letters.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, List<Integer>> record = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (record.containsKey(c)) {
                record.get(c).add(i);
            } else {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(i);
                record.put(c, tempList);
            }
        }
        for (char c : record.keySet()) {
            int dis = record.get(c).get(1) - record.get(c).get(0) - 1;
            if (distance[c - 'a'] != dis) {
                return false;
            }
        }

        return true;
    }
}
