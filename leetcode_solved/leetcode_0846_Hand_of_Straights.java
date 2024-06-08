// Runtime 22 ms Beats 96.11% of users with Java
// Memory 44.82 MB Beats 93.23% of users with Java
// Sort & hashmap.
// T:O(nlogn), S:O(1) ~ O(n)
// 
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (groupSize == 1) {
            return true;
        }
        int len = hand.length;
        if (len % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        HashMap<Integer, Integer> record = new HashMap<>();
        record.put(hand[0], 1);
        int countSame = 1, maxDup = len / groupSize;
        for (int i = 1; i < len; i++) {
            if (hand[i] == hand[i - 1]) {
                countSame++;
                if (countSame > maxDup) {
                    return false;
                }
            } else {
                countSame = 1;
            }
            record.merge(hand[i], 1, Integer::sum);
        }
        for (int elem : hand) {
            if (record.getOrDefault(elem, 0) == 0) {
                continue;
            }
            record.merge(elem, -1, Integer::sum);
            for (int j = elem + 1; j <= elem + groupSize - 1; j++) {
                if (record.getOrDefault(j, 0) == 0) {
                    return false;
                }
                record.merge(j, -1, Integer::sum);
            }
        }

        return true;
    }
}
