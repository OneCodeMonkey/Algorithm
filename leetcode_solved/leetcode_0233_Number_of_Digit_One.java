class Solution {
    public int countDigitOne(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 10) {
            return 1;
        }
        int ret = 0;
        int[] record = new int[n + 1];
        record[0] = 0;
        record[1] = 1;
        ret += 1;
        for (int i = 2; i <= 9; i++) {
            record[i] = 0;
        }
        for (int i = 2; i <= n; i++) {
            record[i] = record[i / 10] + (i % 10 == 1 ? 1 : 0);
            ret += record[i];
        }

        return ret;
    }
}