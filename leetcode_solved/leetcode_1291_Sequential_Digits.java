// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Sequential Digits.
// Memory Usage: 36.6 MB, less than 58.00% of Java online submissions for Sequential Digits.
// see the annotation
// T:O(9 * log10(high)) ~ O(log(n), S:O(1)
//
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ret = new LinkedList<>();
        long cur = 1;
        // step1: get the first number larger than or equal to low, or else directly go to step2
        while (cur % 10 < 9 && cur < low) {
            cur = cur * 10 + (cur % 10 + 1);
        }
        if (cur >= low && cur <= high) {
            ret.add((int) cur);
        }

        // step2, travel from first-digit 1 - 9.
        while (true) {
            // if can append to the tail, cur = cur*10 + (digit + 1)
            if (cur % 10 < 9 && cur * 10 + (cur % 10 + 1) <= high) {
                cur = cur * 10 + (cur % 10 + 1);
                ret.add((int) cur);
            } else {
                // if cannot append, find the first-digit, and +1, if first-digit is already 9, break.
                while (cur >= 10) {
                    cur /= 10;
                }
                if (cur == 9) {
                    break;
                }
                // first digit forwarding
                cur++;

                while (cur % 10 < 9 && cur < low) {
                    cur = cur * 10 + (cur % 10 + 1);
                }
                if (cur >= low && cur <= high) {
                    ret.add((int) cur);
                }
            }
        }

        Collections.sort(ret);

        return ret;
    }
}