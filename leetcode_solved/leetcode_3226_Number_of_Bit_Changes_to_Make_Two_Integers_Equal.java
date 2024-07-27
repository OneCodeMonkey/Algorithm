// Runtime 1 ms Beats 100.00%
// Memory 40.92 MB Beats 100.00%
// binary representation.
// T:O(logn), S:O(logn)
// 
class Solution {
    public int minChanges(int n, int k) {
        int ret = -1;
        if (n == k) {
            ret = 0;
        } else if (n > k) {
            if (n % 2 == 0 && k % 2 == 1) {
                return ret;
            }
            ret = 0;
            List<Integer> bits = new LinkedList<>(), bits2 = new LinkedList<>();
            while (n > 0) {
                int digit = n % 2;
                bits.add(digit);
                n /= 2;
            }
            while (k > 0) {
                int digit = k % 2;
                bits2.add(digit);
                k /= 2;
            }
            for (int i = 0; i < bits.size(); i++) {
                int digit1 = bits.get(i), digit2 = i < bits2.size() ? bits2.get(i) : 0;
                if (digit1 != digit2) {
                    if (digit1 == 0 && digit2 == 1) {
                        return -1;
                    } else {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}
