// AC: Runtime: 6 ms, faster than 66.57% of Java online submissions for X of a Kind in a Deck of Cards.
// Memory Usage: 39.1 MB, less than 69.41% of Java online submissions for X of a Kind in a Deck of Cards.
// hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int size = deck.length, minOccurTime = Integer.MAX_VALUE;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: deck) {
            record.merge(i, 1, Integer::sum);
        }
        for (int i: record.keySet()) {
            if (record.get(i) < minOccurTime) {
                minOccurTime = record.get(i);
            }
        }
        if (minOccurTime < 2) {
            return false;
        }
        for (int divider = 2; divider <= minOccurTime; divider++) {
            if (minOccurTime % divider != 0) {
                continue;
            }
            boolean flag = true;
            for (int i: record.keySet()) {
                if (record.get(i) % divider != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}