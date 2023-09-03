// AC: Runtime 15 ms Beats 42.9%
// Memory 44.6 MB Beats 27.27%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int bestClosingTime(String customers) {
        int len = customers.length(), curN = 0, curY = 0, maxPenalty = len + 1, ret = 0;
        int[] prevNCount = new int[len + 1], suffixYCount = new int[len + 2];
        for (int i = 0; i < len; i++) {
            if (customers.charAt(i) == 'N') {
                curN++;
            }
            prevNCount[i + 1] = curN;
            if (customers.charAt(len - 1 - i) == 'Y') {
                curY++;
            }
            suffixYCount[len - i] = curY;
        }
        for (int i = 0; i < len + 1; i++) {
            int curPenalty = prevNCount[i] + suffixYCount[i + 1];
            if (curPenalty < maxPenalty) {
                ret = i;
                maxPenalty = curPenalty;
            }
        }

        return ret;
    }
}
