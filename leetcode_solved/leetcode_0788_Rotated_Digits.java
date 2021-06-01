// AC: Runtime: 9 ms, faster than 29.64% of Java online submissions for Rotated Digits.
// Memory Usage: 35.8 MB, less than 66.17% of Java online submissions for Rotated Digits.
// Easy to understand
// T:O(nlogn), S:O(1)
//
class Solution {
    public int rotatedDigits(int n) {
        HashSet<Integer> rotateDiff = new HashSet<>(Arrays.asList(2, 5, 6, 9));
        HashSet<Integer> rotateInvalid = new HashSet<>(Arrays.asList(3, 4, 7));
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            int diffCount = 0, iCopy = i;
            boolean flag = true;
            while (iCopy > 0) {
                int bit = iCopy % 10;
                if (rotateInvalid.contains(bit)) {
                    flag = false;
                    break;
                }
                if (rotateDiff.contains(bit)) {
                    diffCount++;
                }
                iCopy /= 10;
            }
            if (flag && diffCount > 0) {
                ret++;
            }
        }

        return ret;
    }
}