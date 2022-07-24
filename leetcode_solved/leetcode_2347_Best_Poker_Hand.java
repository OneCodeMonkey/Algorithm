// AC: Runtime: 3 ms, faster than 53.85% of Java online submissions for Best Poker Hand.
// Memory Usage: 41.6 MB, less than 30.77% of Java online submissions for Best Poker Hand.
// .
// T:O(m + n), S:O(1)
// 
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char suit : suits) {
            record.merge(suit, 1, Integer::sum);
        }
        for (char c : record.keySet()) {
            if (record.get(c) == 5) {
                return "Flush";
            }
        }
        HashMap<Integer, Integer> record2 = new HashMap<>();
        for (int rank : ranks) {
            record2.merge(rank, 1, Integer::sum);
        }
        int maxSame = 0;
        for (int i : record2.keySet()) {
            maxSame = Math.max(maxSame, record2.get(i));
        }
        if (maxSame >= 3) {
            return "Three of a Kind";
        } else if (maxSame == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}