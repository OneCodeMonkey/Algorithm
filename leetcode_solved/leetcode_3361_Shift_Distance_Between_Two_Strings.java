// Runtime 13 ms Beats 100.00%
// Memory 45.57 MB Beats 100.00%
// prefix sum.
// T:O(n), S:O(1)
// 
class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long ret = 0, len = s.length();
        long[] sumNextCost = new long[27], sumPrevCost = new long[27];
        sumNextCost[0] = 0;
        sumPrevCost[0] = 0;
        for (int i = 0; i < 26; i++) {
            sumNextCost[i + 1] = sumNextCost[i] + nextCost[i];
        }
        for (int i = 0; i < 26; i++) {
            sumPrevCost[i + 1] = sumPrevCost[i] + previousCost[i];
        }
        for (int i = 0; i < len; i++) {
            int c1 = s.charAt(i) - 'a' + 1, c2 = t.charAt(i) - 'a' + 1;
            if (c1 < c2) {
                long cost1 = sumNextCost[c2 - 1] - sumNextCost[c1 - 1];
                long cost2 = sumPrevCost[c1] + (sumPrevCost[26] - sumPrevCost[c2]);
                ret += Math.min(cost1, cost2);
            } else {
                long cost1 = sumPrevCost[c1] - sumPrevCost[c2];
                long cost2 = sumNextCost[26] - sumNextCost[c1 - 1] + sumNextCost[c2 - 1];
                ret += Math.min(cost1, cost2);
            }
        }

        return ret;
    }
}
