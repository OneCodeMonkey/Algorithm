// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Defuse the Bomb.
// Memory Usage: 38.8 MB, less than 89.74% of Java online submissions for Defuse the Bomb.
// 略。
// T:O(n), S:O(n)
// 
class Solution {
    public int[] decrypt(int[] code, int k) {
        int size = code.length, tempSum = 0;
        int[] ret = new int[size];
        if (k == 0) {
            return ret;
        } else if (k > 0) {
            int copyK = k;
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    while (copyK-- > 0) {
                        tempSum += code[(copyK + 1) % size];
                    }
                } else {
                    tempSum += code[(i + k) % size];
                    tempSum -= code[i % size];
                }
                ret[i] = tempSum;
            }
        } else {
            int copyK = k;
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    while (copyK++ < 0) {
                        tempSum += code[(size - 1 + copyK) % size];
                    }
                } else {
                    tempSum -= code[(i + size - 1 + k) % size];
                    tempSum += code[(i - 1) % size];
                }
                ret[i] = tempSum;
            }
        }
        return ret;
    }
}