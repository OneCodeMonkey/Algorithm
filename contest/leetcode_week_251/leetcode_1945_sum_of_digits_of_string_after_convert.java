// AC
class Solution {
    public int getLucky(String s, int k) {
        int sumDigit = 0;
        for (char c: s.toCharArray()) {
            int temp = c - 'a' + 1;
            if (temp < 10) {
                sumDigit += temp;
            } else {
                sumDigit += (temp / 10) + (temp % 10);
            }
        }

        int tranSumDigit = sumDigit;
        if (k > 1) {
            for (int i = 1; i < k; i++) {
                int copy = tranSumDigit;
                tranSumDigit = 0;
                while (copy > 0) {
                    tranSumDigit += copy % 10;
                    copy /= 10;
                }
                if (tranSumDigit < 10) {
                    break;
                }
            }
        }

        return tranSumDigit;
    }
}