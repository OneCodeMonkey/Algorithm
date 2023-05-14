// AC: Runtime 3 ms Beats 60%
//  Memory 43.2 MB Beats 20%
// brute-force
// T:O(n), S:O(n)
// 
class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] record = new int[n];
        int pos = 1, round = 1;
        while (record[pos - 1] != 1) {
            record[pos - 1] = 1;
            pos = (pos + round++ * k) % n;
            if (pos == 0) {
                pos = n;
            }
        }
        List<Integer> fail = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (record[i] == 0) {
                fail.add(i + 1);
            }
        }
        int[] ret = new int[fail.size()];
        for (int i = 0; i < fail.size(); i++) {
            ret[i] = fail.get(i);
        }

        return ret;
    }
}
