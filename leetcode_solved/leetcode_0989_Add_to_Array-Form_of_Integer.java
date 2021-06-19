// AC: Runtime: 42 ms, faster than 22.38% of Java online submissions for Add to Array-Form of Integer.
// Memory Usage: 40.3 MB, less than 62.49% of Java online submissions for Add to Array-Form of Integer.
// thought: accumulate from the tail bit of num and k
// T:O(max(num.length, log10(k))), S:O(1)
// 
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ret = new ArrayList<>();
        // forwarding from the tail of num
        int forwarding = 0, size = num.length, pos = size - 1, kBit = 0, numBit = 0;
        while (pos >= 0 || k > 0 || forwarding > 0) {
            kBit = 0;
            if (k > 0) {
                kBit = k % 10;
            }
            numBit = 0;
            if (pos >= 0) {
                numBit = num[pos];
            }
            int tempSum = (kBit + numBit + forwarding);
            forwarding = tempSum >= 10 ? 1 : 0;
            // add to the head of list
            ret.add(0, (forwarding > 0 ? (tempSum - 10) : tempSum));
            k /= 10;
            if (pos >= 0) {
                pos--;
            }
        }

        return ret;
    }
}