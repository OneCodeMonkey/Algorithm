// AC: Runtime: 1 ms, faster than 98.32% of Java online submissions for Permutation Sequence.
// Memory Usage: 36 MB, less than 99.03% of Java online submissions for Permutation Sequence.
// get the forwarding bit of every position, then construct the string by the bit-list
// T:O(n^2), S:O(n)
// 
class Solution {
    public String getPermutation(int n, int k) {
        k--;
        // get the forwarding bit of every position on the base of [1,2,3,4,5,...]
        List<Integer> bit = new LinkedList<>();
        for (int i = n - 1; i >= 1; i--) {
            int factorI = getFactor(i);
            if (k >= factorI) {
                int temp = k / factorI;
                bit.add(temp);
                k = k % factorI;
            } else {
                bit.add(0);
            }
        }
        bit.add(0);

        // forwarding by every bit
        int[] used = new int[n + 1];
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (bit.get(i) != 0) {
                int count = 0;
                for (int j = 1; j < used.length; j++) {
                    if (used[j] == 0) {
                        if (count < bit.get(i)) {
                            count++;
                        } else {
                            ret.append(j);
                            used[j] = 1;
                            break;
                        }
                    }
                }
            } else {
                for (int j = 1; j < used.length; j++) {
                    if (used[j] == 0) {
                        ret.append(j);
                        used[j] = 1;
                        break;
                    }
                }
            }
        }

        return ret.toString();
    }

    private int getFactor(int n) {
        int ret = 1;
        while (n > 1) {
            ret *= n;
            n--;
        }

        return ret;
    }
}